package com.sopt.now.sopkathon.android.ui.setNickname

import android.os.Bundle
import android.view.View
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSetNicknameBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment
import com.sopt.now.sopkathon.android.ui.setNickName.SetNicknameViewModel

class SetNickNameFragment :
    BindingFragment<FragmentSetNicknameBinding>(R.layout.fragment_set_nickname) {
    private val viewmodel by viewModels<SetNicknameViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSetNickNameBtnClickListener()
        observeNickNameEditText()
    }

    private fun observeNickNameEditText() {
        binding.etSetNicknameInputNickname.doAfterTextChanged {
            if (it.isNullOrEmpty()) {
                binding.etSetNicknameInputNickname.setTextColor(0xFFFFFF)
            }
        }
    }

    private fun initSetNickNameBtnClickListener() {
        binding.btnSetNickNameFailure.setOnClickListener {
            findNavController().navigate(R.id.fragment_friend_list)
        }
    }
}
