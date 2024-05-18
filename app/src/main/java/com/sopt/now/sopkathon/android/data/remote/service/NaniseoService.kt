package com.sopt.now.sopkathon.android.data.remote.service

import com.sopt.now.sopkathon.android.data.remote.request.QuestionResponse
import retrofit2.Response
import retrofit2.http.GET

interface NaniseoService {

    @GET("answer/list")
    suspend fun getAnswerList(
    ): Response<QuestionResponse>
}