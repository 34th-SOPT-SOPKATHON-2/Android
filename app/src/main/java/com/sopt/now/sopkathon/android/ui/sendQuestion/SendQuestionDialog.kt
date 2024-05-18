package com.sopt.now.sopkathon.android.ui.sendQuestion

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.DialogSendQuestionBinding

class SendQuestionDialog : DialogFragment() {
    private var _binding: DialogSendQuestionBinding? = null
    private val binding: DialogSendQuestionBinding get() = requireNotNull(_binding)

    private val viewModel: SendQuestionViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogSendQuestionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupDialogAppearance()
        setupText()
        viewModel.getQuestions()
        setupBtns()
    }

    private fun setupDialogAppearance() {
        dialog?.window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            attributes?.windowAnimations = R.style.BottomSheetDialogAnimation
            setGravity(Gravity.BOTTOM)
        }
    }

    private fun setupText() {
        binding.tvBottomSheetTitle.text = viewModel.selectedCategory.value
        viewModel.questions.observe(viewLifecycleOwner){
            binding.tvBottomSheetFirst.text = it[0]
            binding.tvBottomSheetSecond.text = it[1]
            binding.tvBottomSheetThird.text = it[2]
        }
    }

    private fun setupBtns() {
        binding.tvBottomSheetFirst.setOnClickListener {
            viewModel.setQuestion(binding.tvBottomSheetFirst.text.toString())
            dismiss()
        }
        binding.tvBottomSheetSecond.setOnClickListener {
            viewModel.setQuestion(binding.tvBottomSheetSecond.text.toString())
            dismiss()
        }
        binding.tvBottomSheetThird.setOnClickListener {
            viewModel.setQuestion(binding.tvBottomSheetThird.text.toString())
            dismiss()
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
