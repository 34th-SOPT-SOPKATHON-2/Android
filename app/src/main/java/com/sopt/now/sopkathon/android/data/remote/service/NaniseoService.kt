package com.sopt.now.sopkathon.android.data.remote.service

import com.sopt.now.sopkathon.android.data.remote.request.QuestionResponse
import com.sopt.now.sopkathon.android.data.remote.response.MyInfoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface NaniseoService {

    @GET("answer/list")
    suspend fun getAnswerList(
    ): Response<QuestionResponse>

    @GET("mypage/{memberId}")
    suspend fun getMyInfo(
        @Path("memberId") memberId: Int
    ): Response<MyInfoResponse>
}