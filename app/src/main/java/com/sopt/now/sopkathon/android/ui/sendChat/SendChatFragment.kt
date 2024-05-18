package com.sopt.now.sopkathon.android.ui.sendChat

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSendChatBinding
import com.sopt.now.sopkathon.android.ui.chatList.ChatListFragmentArgs
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment
import com.sopt.now.sopkathon.android.ui.sendchat.SendChatDialogFragment
import kotlinx.coroutines.*

class SendChatFragment :
    BindingFragment<FragmentSendChatBinding>(R.layout.fragment_send_chat) {

    private var deleteDialog: SendChatDialogFragment? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showDialog()
        getNickname()
        showResponse()
    }

    private fun getNickname() {
        val args: ChatListFragmentArgs by navArgs()
    }

    private fun showDialog() {
        viewLifecycleOwner.lifecycleScope.launch {
            delay(5000)

            deleteDialog = SendChatDialogFragment()
            deleteDialog?.show(childFragmentManager, deleteDialog?.tag)

            repeat(10) { second ->
                val timeLeft = 10 - second
                deleteDialog?.updateTimer(timeLeft)
                if (second == 3) {
                    deleteDialog?.makeEggInvisible()
                }
                delay(1000)
            }
            deleteDialog?.dismiss()
        }
    }

    private fun showResponse() {
        viewLifecycleOwner.lifecycleScope.launch {
            delay(3000)
            binding.imgSendGetProfile.visibility = View.VISIBLE
            binding.tvSendGetText.visibility = View.VISIBLE
        }
    }
}