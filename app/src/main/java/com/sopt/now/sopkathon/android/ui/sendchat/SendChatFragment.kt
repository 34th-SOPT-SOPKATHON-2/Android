package com.sopt.now.sopkathon.android.ui.sendchat

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSendChatBinding
import com.sopt.now.sopkathon.android.ui.chatList.ChatListFragmentArgs
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class SendChatFragment :
    BindingFragment<FragmentSendChatBinding>(R.layout.fragment_send_chat) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getNickname()
    }

    private fun getNickname(){
        val args : ChatListFragmentArgs by navArgs()

    }
}