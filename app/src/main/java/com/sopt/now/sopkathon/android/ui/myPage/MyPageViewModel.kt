package com.sopt.now.sopkathon.android.ui.myPage

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.data.ServicePool
import com.sopt.now.sopkathon.android.data.remote.response.MyInfoResponse
import kotlinx.coroutines.launch

class MyPageViewModel : ViewModel() {
    private val _profile = MutableLiveData<MyInfoResponse.Data>()
    val profile: LiveData<MyInfoResponse.Data> get() = _profile

    private val _badge = MutableLiveData<List<Badge>>()
    val badge: LiveData<List<Badge>> get() = _badge

    init {
        _badge.value = listOf(
            Badge(
                "프로지각해결사",
                R.drawable.ic_badge_late
            ),
            Badge("프로(안)읽씹해결사", R.drawable.ic_happy),
            Badge("프로정산해결사", R.drawable.ic_money),
            Badge("프로약속해결사", R.drawable.ic_promiss),
            Badge("프로축하해결사", R.drawable.ic_present)
        )
    }

    fun updateProfile() {
        viewModelScope.launch {
            runCatching {
                ServicePool.naniseoService.getMyInfo(1)
            }.onSuccess {
                _profile.value = it.body()?.data
            }.onFailure {
                Log.e("SplashViewModel", "postLogin Error: ${it.message}")
            }
        }
    }
}

data class Badge(
    val name: String,
    val imgUrl: Int,
)