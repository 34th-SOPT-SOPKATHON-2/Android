package com.sopt.now.sopkathon.android.data.remote.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SetNicknameRequest(
    @SerialName("nickName")
    val message: String,
)