package com.sopt.now.sopkathon.android.data.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChatResponse(
    @SerialName("status")
    val status: Int,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val data: List<Data>
) {
    @Serializable
    data class Data(
        @SerialName("chatId")
        val chatId: Int,
        @SerialName("memberId")
        val memberId: Int,
        @SerialName("friendId")
        val friendId: Int,
        @SerialName("friendName")
        val friendName: String,
        @SerialName("friendImgUrl")
        val friendImgUrl: String,
        @SerialName("data")
        val data: String
    )
}
