package com.sopt.now.sopkathon.android.ui.sendQuestion

import android.os.Bundle
import android.view.View
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.data.local.SendQuestionCategory
import com.sopt.now.sopkathon.android.databinding.FragmentSendQuestionBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class SendQuestionFragment :
    BindingFragment<FragmentSendQuestionBinding>(R.layout.fragment_send_question) {

    private val sendQuestionAdapter = SendQuestionAdapter()
    private var sendQuestionDialog: SendQuestionDialog? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        loadQuestions()
        setupBottomSheet()
    }

    private fun setupRecyclerView() {
        binding.rvSendQuestion.adapter = sendQuestionAdapter
    }

    private fun loadQuestions() {
        val questions = SendQuestionCategory.sendQuestionCategories
        sendQuestionAdapter.submitList(questions)
    }

    private fun setupBottomSheet() {
        binding.viewSendQuestionDescription.setOnClickListener {
            if (sendQuestionDialog == null || !sendQuestionDialog!!.isAdded) {
                sendQuestionDialog = SendQuestionDialog()
                sendQuestionDialog!!.show(parentFragmentManager, "DatePickerDialog")
            }
        }
    }
}