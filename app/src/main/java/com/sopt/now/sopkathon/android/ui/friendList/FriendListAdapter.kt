package com.sopt.now.sopkathon.android.ui.friendList


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sopt.now.sopkathon.android.databinding.ItemFriendListBinding
import com.sopt.now.sopkathon.android.util.view.ItemDiffCallback

class FriendListAdapter(private val itemFriendClick: (Friend) -> Unit) :
    ListAdapter<Friend, RecyclerView.ViewHolder>(ItemDiffCallback<Friend>(
        onItemsTheSame = { old, new -> old == new },
        onContentsTheSame = { old, new -> old == new }
    )) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendListViewHolder =
        FriendListViewHolder(
            ItemFriendListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            itemFriendClick
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is FriendListViewHolder) holder.onBind(currentList[position])
    }
}