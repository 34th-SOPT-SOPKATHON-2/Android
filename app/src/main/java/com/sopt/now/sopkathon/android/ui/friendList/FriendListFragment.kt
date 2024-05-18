package com.sopt.now.sopkathon.android.ui.friendList

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentFriendListBinding
import com.sopt.now.sopkathon.android.databinding.FragmentSetNicknameBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class FriendListFragment :
    BindingFragment<FragmentFriendListBinding>(R.layout.fragment_friend_list) {
    private val friendListViewModel: FriendListViewModel by viewModels()
    private lateinit var friendListAdapter: FriendListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        friendListAdapter = FriendListAdapter { friend ->
//            val action = FriendListFragmentDirections
//                .actionFragmentFriendListToFragmentChatList(friend.nickname)
//            findNavController().navigate(action)
        }
        binding.rvFriend.adapter = friendListAdapter
        binding.rvFriend.layoutManager = LinearLayoutManager(requireContext())
        friendListViewModel.friend.observe(viewLifecycleOwner) {
            friendListAdapter.submitList(it)
        }
    }

}