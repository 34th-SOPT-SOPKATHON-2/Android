package com.sopt.now.sopkathon.android.ui.myPage

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sopt.now.sopkathon.android.databinding.ItemMyPageBinding


class MyPageViewHolder(
    private val binding: ItemMyPageBinding,
) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(badge: Badge){
        binding.run {
            tvMyPageTagName.text = badge.name
            ivMyPageTag.load(badge.imgUrl)
        }
    }
}
