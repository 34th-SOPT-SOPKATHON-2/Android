package com.sopt.now.sopkathon.android.ui.friendList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

class FriendListViewModel : ViewModel() {
    private val _friend = MutableLiveData<List<Friend>>()
    val friend: LiveData<List<Friend>> get() = _friend

    init {
        _friend.value = listOf(
            Friend(1, "test1", 0,""),
            Friend(1, "test2", 0,""),
            Friend(1, "test3", 0,""),
            Friend(1, "test4", 0,""),
        )
    }

    fun getInfo(userId : Int){
        viewModelScope.runCatching {
//            ServicePool.naniseoService.getFriendInfo(userId)
        }.onSuccess {

        }.onFailure {  }
    }

}