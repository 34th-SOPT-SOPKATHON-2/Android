package com.sopt.now.sopkathon.android.data.remote.service

import com.sopt.now.sopkathon.android.data.remote.request.QuestionResponse
import com.sopt.now.sopkathon.android.data.remote.response.Friends
import com.sopt.now.sopkathon.android.data.remote.response.ResponseFriendDto

import com.sopt.now.sopkathon.android.data.remote.response.ChatResponse
import com.sopt.now.sopkathon.android.data.remote.request.SetNicknameRequest
import com.sopt.now.sopkathon.android.data.remote.response.MyInfoResponse
import com.sopt.now.sopkathon.android.data.remote.response.SetNicknameResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PUT
import retrofit2.http.Path

interface NaniseoService {

    @GET("answer/list")
    suspend fun getAnswerList(
    ): Response<QuestionResponse>

    @GET("friend-list/")
    suspend fun getFriendList(
        @Header("memberId") userId: Int
    ): Response<ResponseFriendDto>

    @GET("mypage/{memberId}")
    suspend fun getMyInfo(
        @Path("memberId") memberId: Int
    ): Response<MyInfoResponse>

    @PUT("mypage/{memberId}")
    suspend fun setNickname(
        @Path("memberId") memberId: Int,
        @Body request: SetNicknameRequest
    ): Response<SetNicknameResponse>
}