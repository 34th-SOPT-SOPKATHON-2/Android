package com.sopt.now.sopkathon.android.ui.myPage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.sopt.now.sopkathon.android.databinding.ItemMyPageBinding
import com.sopt.now.sopkathon.android.util.view.ItemDiffCallback

class MyPageAdapter : ListAdapter<Badge, RecyclerView.ViewHolder>(ItemDiffCallback<Badge>(
    onItemsTheSame = { old, new -> old == new },
    onContentsTheSame = { old, new -> old == new }
)) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyPageViewHolder(
            ItemMyPageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
        )


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyPageViewHolder) holder.onBind(currentList[position])
    }
}
