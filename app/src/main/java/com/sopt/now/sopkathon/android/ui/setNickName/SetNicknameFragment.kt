package com.sopt.now.sopkathon.android.ui.setNickName

import android.os.Bundle
import android.view.View
import androidx.compose.ui.graphics.Color
import androidx.core.widget.doAfterTextChanged
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
        observeNickNameEditText()
        observeInputNickName()
        initBtnClickListener()

    }

    private fun observeNickNameEditText(){
        binding.etSetNicknameInputNickname.doAfterTextChanged {
            viewmodel.updateNickName(it.toString())
        }
    }

    private fun observeInputNickName(){
        viewmodel.nickName.observe(viewLifecycleOwner){
            if(viewmodel.checkInvalidNickName()==false){
                binding.viewSetNicknameInputText.setBackgroundColor(0xFFFFFF)
            }

        }
    }
    private fun initBtnClickListener() {
        binding.btnAsdas.setOnClickListener {



            findNavController().navigate(R.id.fragment_friend_list)
        }
    }
}
