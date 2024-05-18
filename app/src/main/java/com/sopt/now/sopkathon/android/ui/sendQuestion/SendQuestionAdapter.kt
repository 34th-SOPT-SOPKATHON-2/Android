package com.sopt.now.sopkathon.android.ui.sendQuestion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import coil.transform.CircleCropTransformation
import com.sopt.now.sopkathon.android.data.local.SendQuestionCategory
import com.sopt.now.sopkathon.android.databinding.ItemSendQuestionBinding
import com.sopt.now.sopkathon.android.util.view.ItemDiffCallback

class SendQuestionAdapter(private val onClick: (String) -> (Unit)) :
    ListAdapter<SendQuestionCategory, SendQuestionAdapter.SendQuestionViewHolder>(
        ItemDiffCallback<SendQuestionCategory>(
            onItemsTheSame = { old, new -> old == new },
            onContentsTheSame = { old, new -> old == new }
        )
    ) {

    class SendQuestionViewHolder(
        private val binding: ItemSendQuestionBinding,
        private val onClick: (String) -> Unit
    ) :
        ViewHolder(binding.root) {
        fun bind(item: SendQuestionCategory) {
            binding.apply {
                ivSendQuestionItem.load(item.icon) {
                    crossfade(true)
                    transformations(CircleCropTransformation())
                }
                tvSendQuestionItem.text = item.category

                ivSendQuestionItem.load(item.icon)

                viewSendQuestionItem.setCardBackgroundColor(android.graphics.Color.parseColor(item.hash))

                root.setOnClickListener {
                    onClick(item.category)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SendQuestionViewHolder {
        val binding =
            ItemSendQuestionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SendQuestionViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: SendQuestionViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}