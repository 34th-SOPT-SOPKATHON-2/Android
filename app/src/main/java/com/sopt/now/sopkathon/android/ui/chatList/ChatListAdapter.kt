package com.sopt.now.sopkathon.android.ui.chatList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.sopt.now.sopkathon.android.data.remote.response.FriendModel
import com.sopt.now.sopkathon.android.databinding.ItemChatListBinding
import com.sopt.now.sopkathon.android.util.view.ItemDiffCallback

class ChatListAdapter(
    private val itemChatClick: (FriendModel) -> Unit
) : ListAdapter<FriendModel, ChatListViewHolder>(diffUtil) {

    private var friendList: List<FriendModel> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder {
        val inflater by lazy { LayoutInflater.from(parent.context) }
        val binding: ItemChatListBinding =
            ItemChatListBinding.inflate(
                inflater,
                parent,
                false
            )
        return ChatListViewHolder(binding, itemChatClick)
    }

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {
        holder.onBind(friendList[position])
    }

    override fun getItemCount() = friendList.size
    fun setFriendList(friendList: List<FriendModel>) {
        this.friendList = friendList.toList()
        notifyDataSetChanged()
    }

    companion object {
        private val diffUtil = ItemDiffCallback<FriendModel>(
            onItemsTheSame = { old, new -> old == new },
            onContentsTheSame = { old, new -> old == new }
        )
    }
}