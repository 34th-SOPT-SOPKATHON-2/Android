package com.sopt.now.sopkathon.android.data.remote.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetNicknameResponse(
    @SerialName("message")
    val message: String,
)