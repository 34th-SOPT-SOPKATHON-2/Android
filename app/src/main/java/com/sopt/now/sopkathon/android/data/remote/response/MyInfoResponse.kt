package com.sopt.now.sopkathon.android.data.remote.response


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MyInfoResponse(
    @SerialName("status")
    val status: Int,
    @SerialName("message")
    val message: String,
    @SerialName("data")
    val `data`: Data
) {
    @Serializable
    data class Data(
        @SerialName("id")
        val id: Int,
        @SerialName("nickName")
        val nickName: String,
        @SerialName("totalZeroCount")
        val totalZeroCount: Int,
        @SerialName("imgUrl")
        val imgUrl: String
    )
}