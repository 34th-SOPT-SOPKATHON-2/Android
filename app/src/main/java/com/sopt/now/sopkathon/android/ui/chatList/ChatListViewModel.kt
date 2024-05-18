package com.sopt.now.sopkathon.android.ui.chatList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.data.ServicePool
import com.sopt.now.sopkathon.android.data.remote.response.ChatResponse
import com.sopt.now.sopkathon.android.data.remote.response.FriendModel
import kotlinx.coroutines.launch

class ChatListViewModel : ViewModel() {


    val mockFriendInfoLists = listOf(
        FriendModel(
            image = R.drawable.ic_happy,
            nickname = "넌이서",
            sub = "나 서운해. 왜 맨날 지각해",
            isList = true
        ),
        FriendModel(
            image = R.drawable.ic_happy,
            nickname = "나니서",
            sub = "나 서운해. 맨날 나만 선톡해",
            isList = true
        ),
        FriendModel(
            image = R.drawable.ic_main_2,
            nickname = "노니서",
            sub = "나 서운해. 왜 맨날 나만 계산해",
            isList = true
        ),
        FriendModel(
            image = R.drawable.ic_launcher_background,
            nickname = "난이서",
            sub = "나 서운해. 너 T야? 난 F야",
            isList = true
        )
    )

}