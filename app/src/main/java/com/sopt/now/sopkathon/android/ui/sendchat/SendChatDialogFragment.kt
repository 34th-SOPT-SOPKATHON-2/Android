package com.sopt.now.sopkathon.android.ui.sendchat

import android.os.Bundle
import android.view.View
import android.view.WindowManager
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


}