package com.sopt.now.sopkathon.android.ui.friendList

import android.os.Bundle
import android.view.View
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentFriendListBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class FriendListFragment :
    BindingFragment<FragmentFriendListBinding>(R.layout.fragment_friend_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapterWithClickListener()
    }

    private fun initAdapterWithClickListener(){

    }
}