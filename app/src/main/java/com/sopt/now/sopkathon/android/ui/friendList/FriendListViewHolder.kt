package com.sopt.now.sopkathon.android.ui.friendList


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.ItemFriendListBinding

class FriendListViewHolder(
    private val binding: ItemFriendListBinding,
    private val itemFriendClick: (Friend) -> Unit
) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(friend: Friend) {
        binding.run {
            tvFriendNickname.text = friend.nickname
            btnFriendProfile.setOnClickListener {
                if (clFriendProfileInfo.visibility == View.VISIBLE)
                    clFriendProfileInfo.visibility = View.GONE
                else clFriendProfileInfo.visibility = View.VISIBLE
            }
            tvFriendProfile.text = binding.root.context.getString(R.string.friend_profile).format(friend.totalZeroCount)
            btnFriendFirst.setOnClickListener {
                itemFriendClick(friend)
            }
            ivFriendProfile.load(friend.imgUrl)
        }
    }
}