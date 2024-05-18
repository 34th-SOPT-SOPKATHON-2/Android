package com.sopt.now.sopkathon.android.ui.chatList

import androidx.lifecycle.ViewModel
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.data.remote.response.FriendModel

class ChatListViewModel : ViewModel() {

    val mockFriendInfoLists = listOf(
        FriendModel(
            image = R.drawable.ic_launcher_background,
            nickname = "이유빈임",
            sub = "그니까 이게",
            isList = true
        ),
        FriendModel(
            image = R.drawable.ic_launcher_background,
            nickname = "이유빈임",
            sub = "그니까 이게",
            isList = true
        )
    )

}