package com.sopt.now.sopkathon.android.ui.setNickname

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSetNicknameBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class SetNickNameFragment :
    BindingFragment<FragmentSetNicknameBinding>(R.layout.fragment_set_nickname) {
    private val viewmodel by viewModels<SetNicknameViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initSetNickNameBtnClickListener()
        observeNickNameEditText()
    }

    private fun observeNickNameEditText() {
        viewmodel.response.observe(viewLifecycleOwner) {
            if (it == "정상 출력") findNavController().navigate(R.id.fragment_friend_list)
            Toast.makeText(context, "정상적으로 닉네임이 변경되었습니다!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initSetNickNameBtnClickListener() {
        binding.btnSetNickNameFailure.setOnClickListener {
            viewmodel.setNickname(binding.etSetNicknameInputNickname.text.toString())
        }
    }
}
