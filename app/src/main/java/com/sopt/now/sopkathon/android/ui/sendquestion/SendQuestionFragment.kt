package com.sopt.now.sopkathon.android.ui.sendquestion

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSendQuestionBinding
import com.sopt.now.sopkathon.android.ui.chatList.ChatListFragmentArgs
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment


class SendQuestionFragment :
    BindingFragment<FragmentSendQuestionBinding>(R.layout.fragment_send_question) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getNickname()
    }

    private fun getNickname(){
        val args : ChatListFragmentArgs by navArgs()

    }
}