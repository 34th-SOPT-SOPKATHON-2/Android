package com.sopt.now.sopkathon.android.ui.friendList

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.now.sopkathon.android.data.ServicePool
import com.sopt.now.sopkathon.android.data.remote.response.Friends
import kotlinx.coroutines.launch

class FriendListViewModel : ViewModel() {
    private val _friend = MutableLiveData<List<Friends>>()
    val friend: LiveData<List<Friends>> get() = _friend

    init {


    }

    fun getInfo(userId: Int) {
        viewModelScope.launch {
            runCatching {
                ServicePool.naniseoService.getFriendList(userId)
            }.onSuccess {
                _friend.value = it.body()?.data
            }.onFailure {
                Log.e("SplashViewModel", "postLogin Error: ${it.message}")
            }
        }
    }
}

