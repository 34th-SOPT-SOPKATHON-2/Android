package com.sopt.now.sopkathon.android.util.view

import androidx.recyclerview.widget.DiffUtil

class ItemDiffCallback<T : Any>(
    val onItemsTheSame: (T, T) -> Boolean,
    val onContentsTheSame: (T, T) -> Boolean
) : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(
        oldItem: T, newItem: T
    ): Boolean = onItemsTheSame(oldItem, newItem)

    override fun areContentsTheSame(
        oldItem: T, newItem: T
    ): Boolean = onContentsTheSame(oldItem, newItem)
}

//아래와 같이 사용하시면 됩니다.
//
//class DummyAdapter : ListAdapter<Int, DummyViewHolder>(
//    ItemDiffCallback<Int>(
//        onItemsTheSame = { old, new -> old == new },
//        onContentsTheSame = { old, new -> old == new }
//    )
//)
