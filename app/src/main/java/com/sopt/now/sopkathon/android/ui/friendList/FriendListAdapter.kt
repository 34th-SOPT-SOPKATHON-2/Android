package com.sopt.now.sopkathon.android.ui.friendList

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.sopt.now.sopkathon.android.data.remote.response.FriendModel
import com.sopt.now.sopkathon.android.util.view.ItemDiffCallback

class FriendListAdapter(
    private val itemChatClick: (FriendModel) -> Unit
) : ListAdapter<FriendModel, FriendListViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FriendListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        private val diffUtil = ItemDiffCallback<FriendModel>(
            onItemsTheSame = { old, new -> old == new },
            onContentsTheSame = { old, new -> old == new }
        )
    }
}