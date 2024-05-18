package com.sopt.now.sopkathon.android.ui.chatList

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sopt.now.sopkathon.android.data.remote.response.FriendModel
import com.sopt.now.sopkathon.android.databinding.ItemChatListBinding

class ChatListViewHolder(
    private val binding: ItemChatListBinding,
    private val itemChatClick: (FriendModel) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(item: FriendModel) {
        with(binding) {
            imgChatProfile.load(item.image)
            tvChatNickname.text = item.nickname
            tvChatSub.text = item.sub

            root.setOnClickListener {
                itemChatClick(item)
            }
        }
    }

}
