package com.sopt.now.sopkathon.android.ui.chatList

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentChatListBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class ChatListFragment :
    BindingFragment<FragmentChatListBinding>(R.layout.fragment_chat_list) {

    private var _adapter: ChatListAdapter? = null
    private val adapter get() = requireNotNull(_adapter) { getString(R.string.adapter_not_initialized_error_msg) }

    private val chatListViewModel by activityViewModels<ChatListViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapterWithClickListener()
    }

    private fun initAdapterWithClickListener() {
        _adapter = ChatListAdapter { friendModel ->

            val action =
                ChatListFragmentDirections.actionFragmentChatListToFragmentSendChat()
            findNavController().navigate(action)

//            val nickname = friendModel.nickname
//            if (friendModel.isList) {
//                val action =
//                    ChatListFragmentDirections.actionFragmentChatListToSendQuestionFragment(nickname)
//                findNavController().navigate(action)
//            } else {
////                val action =
//            }
        }
        binding.rvChatList.adapter = adapter
        adapter.setFriendList(chatListViewModel.mockFriendInfoLists)
    }
}