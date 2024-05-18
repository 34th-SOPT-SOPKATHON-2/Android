package com.sopt.now.sopkathon.android.ui.sendQuestion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.data.local.SendQuestionCategory
import com.sopt.now.sopkathon.android.databinding.FragmentSendQuestionBinding
import com.sopt.now.sopkathon.android.ui.chatList.ChatListFragmentArgs
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class SendQuestionFragment :
    BindingFragment<FragmentSendQuestionBinding>(R.layout.fragment_send_question) {

    private lateinit var sendQuestionAdapter: SendQuestionAdapter
    private var sendQuestionDialog: SendQuestionDialog? = null
    private val viewModel: SendQuestionViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
        loadQuestions()
        setupBottomSheet()
        getNickname()
    }

    private fun setupRecyclerView() {
        sendQuestionAdapter = SendQuestionAdapter { category ->
            viewModel.setCategory(category)
            showBottomSheet()
        }
        binding.rvSendQuestion.adapter = sendQuestionAdapter
    }

    private fun loadQuestions() {
        val questions = SendQuestionCategory.sendQuestionCategories
        sendQuestionAdapter.submitList(questions)
    }

    private fun setupBottomSheet() {
        binding.viewSendQuestionDescription.setOnClickListener {
            showBottomSheet()
        }
    }

    private fun showBottomSheet() {
        if (sendQuestionDialog == null || !sendQuestionDialog!!.isAdded) {
            sendQuestionDialog = SendQuestionDialog()
            sendQuestionDialog!!.show(parentFragmentManager, "DatePickerDialog")
        }
    }

    private fun observeSelectedQuestion() {
        viewModel.selectedQuestion.observe(viewLifecycleOwner) { question ->
            if (!question.isNullOrEmpty()) {
            }
        }
    }

    private fun getNickname() {
        val args: ChatListFragmentArgs by navArgs()
    }
}