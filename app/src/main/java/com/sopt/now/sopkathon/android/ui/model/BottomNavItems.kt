package com.sopt.now.sopkathon.android.ui.model

import com.sopt.now.sopkathon.android.R

enum class BottomNavItems(val id: Int) {
    FRIEND_LIST(R.id.fragment_friend_list), CHAT_LIST(R.id.fragment_chat_list), MY_PAGE(R.id.fragment_my_page);

    companion object {
        val bottomNavItems = listOf(FRIEND_LIST.id, CHAT_LIST.id, MY_PAGE.id)
    }
}