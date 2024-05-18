package com.sopt.now.sopkathon.android.ui.myPage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyPageViewModel : ViewModel() {
    private val _profile = MutableLiveData<MyPage>()
    val profile : LiveData<MyPage>  get() = _profile

    private val _badge  = MutableLiveData<List<Badge>>()
    val badge : LiveData<List<Badge>> get() = _badge
    init {

        _profile.value= MyPage("명석")

        _badge.value= listOf(
            Badge("안드 최고상",true),
            Badge("디자인 최고상",true),
            Badge("서버 최고상",true),
            Badge("기획 최고상",true),
        )
    }
}
data class MyPage(
    val name: String
)

data class Badge(
    val name: String,
    val get: Boolean,
)