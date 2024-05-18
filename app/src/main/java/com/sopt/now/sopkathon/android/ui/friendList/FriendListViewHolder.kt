package com.sopt.now.sopkathon.android.ui.friendList


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.data.remote.response.Friends
import com.sopt.now.sopkathon.android.databinding.ItemFriendListBinding

class FriendListViewHolder(
    private val binding: ItemFriendListBinding,
    private val itemFriendClick: (Friends) -> Unit
) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(friend: Friends) {
        binding.run {
            tvFriendNickname.text = friend.nickName

            btnFriendProfile.setOnClickListener {
                if (clFriendProfileInfo.visibility == View.VISIBLE)
                    clFriendProfileInfo.visibility = View.GONE
                else clFriendProfileInfo.visibility = View.VISIBLE
            }
            tvFriendProfile.text = binding.root.context.getString(R.string.friend_profile)
                .format(friend.friendZeroCount)
            btnFriendFirst.setOnClickListener {
                itemFriendClick(friend)
            }
            ivFriendProfile.load(friend.imgUrl)


            when (friend.id % 4) {
                1 -> ivFriendProfile.load(R.drawable.img_profile_01)
                2 -> ivFriendProfile.load(R.drawable.img_profile_02)
                3 -> ivFriendProfile.load(R.drawable.img_profile_03)
                else -> ivFriendProfile.load(R.drawable.img_profile_04)
            }
        }
    }
}