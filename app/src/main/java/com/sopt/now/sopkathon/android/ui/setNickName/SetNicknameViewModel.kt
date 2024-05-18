package com.sopt.now.sopkathon.android.ui.setNickName

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SetNicknameViewModel : ViewModel() {
    private val _nickName: MutableLiveData<String> = MutableLiveData("")
    val nickName: LiveData<String> get() = _nickName


    fun updateNickName(msg: String) {
        _nickName.value = msg

    }

    fun checkInvalidNickName(): Boolean {
        if(nickName.value.isNullOrEmpty() || nickName.value!!.length>10){
            return false
        }
        return true
    }
}