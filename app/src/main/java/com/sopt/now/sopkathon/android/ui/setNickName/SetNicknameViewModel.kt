package com.sopt.now.sopkathon.android.ui.setNickname

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.now.sopkathon.android.data.ServicePool
import com.sopt.now.sopkathon.android.data.remote.request.SetNicknameRequest
import com.sopt.now.sopkathon.android.data.remote.response.SetNicknameResponse
import kotlinx.coroutines.launch

class SetNicknameViewModel : ViewModel() {

    private var _response = MutableLiveData<String>()
    val response: LiveData<String> get() = _response

    fun setNickname(input: String) {
        viewModelScope.launch {
            runCatching {
                ServicePool.naniseoService.setNickname(1, SetNicknameRequest(input))
            }.onSuccess {
                _response.value = it.body()?.message
                Log.e("SplashViewModelTest", "postLogin Error: ${it.body()}")
            }.onFailure {
                Log.e("SplashViewModelTest", "postLogin Error: ${it.message}")
            }
        }
    }
}