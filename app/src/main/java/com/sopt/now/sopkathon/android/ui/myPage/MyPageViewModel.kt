package com.sopt.now.sopkathon.android.ui.myPage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sopt.now.sopkathon.android.R

class MyPageViewModel : ViewModel() {
    private val _profile = MutableLiveData<MyPage>()
    val profile: LiveData<MyPage> get() = _profile

    private val _badge = MutableLiveData<List<Badge>>()
    val badge: LiveData<List<Badge>> get() = _badge

    init {

        _profile.value = MyPage("명석")

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
}

data class MyPage(
    val name: String
)

data class Badge(
    val name: String,
    val imgUrl: Int,
)