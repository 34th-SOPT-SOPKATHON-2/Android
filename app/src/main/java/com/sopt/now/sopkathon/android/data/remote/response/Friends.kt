package com.sopt.now.sopkathon.android.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ResponseFriendDto(
    @SerialName("status")
    val status: Int,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: List<Friends>
)

@Serializable
data class Friends(
    @SerialName("id")
    val id: Int,
    @SerialName("friendZeroCount")
    val friendZeroCount: Int,
    @SerialName("member_id")
    val memberId: Int,
    @SerialName("nickName")
    val nickName: String,
    @SerialName("imgUrl")
    val imgUrl: String,
)