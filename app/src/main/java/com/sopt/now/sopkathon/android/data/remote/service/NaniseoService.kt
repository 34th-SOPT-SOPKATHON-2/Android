package com.sopt.now.sopkathon.android.data.remote.service

import com.sopt.now.sopkathon.android.data.remote.request.QuestionResponse
import com.sopt.now.sopkathon.android.data.remote.response.Friends
import com.sopt.now.sopkathon.android.data.remote.response.ResponseFriendDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface NaniseoService {

    @GET("answer/list")
    suspend fun getAnswerList(
    ): Response<QuestionResponse>

    @GET("friend-list/")
    suspend fun getFriendList(
        @Header("memberId") userId: Int
    ): Response<ResponseFriendDto>
}