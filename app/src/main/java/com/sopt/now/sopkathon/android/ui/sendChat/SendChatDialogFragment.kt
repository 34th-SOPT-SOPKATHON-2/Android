package com.sopt.now.sopkathon.android.ui.sendchat

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSendChatDialogBinding
import com.sopt.now.sopkathon.android.ui.common.base.BaseDialog

class SendChatDialogFragment :
    BaseDialog<FragmentSendChatDialogBinding>(R.layout.fragment_send_chat_dialog) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initDeleteBtnClickListener()
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.apply {
            setLayout(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
            )
        }
    }

    private fun initDeleteBtnClickListener() {
        binding.btnSendDelete.setOnClickListener {
            dismiss()
        }
    }

    fun updateTimer(secondsLeft: Int) {
        view?.findViewById<TextView>(R.id.tv_send_title)?.text = "${secondsLeft}초 뒤에 채팅이 사라져요"
    }

    fun makeEggInvisible() {
        view?.findViewById<View>(R.id.img_send_main_3)?.visibility = View.VISIBLE
        view?.findViewById<View>(R.id.img_send_main)?.visibility = View.INVISIBLE
    }

}