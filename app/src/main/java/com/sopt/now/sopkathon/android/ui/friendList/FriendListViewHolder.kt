package com.sopt.now.sopkathon.android.ui.friendList

import androidx.recyclerview.widget.RecyclerView
import com.sopt.now.sopkathon.android.data.remote.response.FriendModel
import com.sopt.now.sopkathon.android.databinding.ItemChatListBinding

class FriendListViewHolder (
    val binding: ItemChatListBinding,
    private val itemChatClick: (FriendModel) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

//    fun onBind(item: FriendModel){
//        with(binding){
//            imgChatProfile.id = item.image,
//            tvChatTitle.text = item.title,
//            tvChatSub.text = item.sub
//        }
//    }
}
