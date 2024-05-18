package com.sopt.now.sopkathon.android.data.local

import com.sopt.now.sopkathon.android.R

data class SendQuestionCategory(
    val id: Int,
    val category: String,
    val icon: Int,
) {
    companion object {
        val sendQuestionCategories = listOf(
            SendQuestionCategory(
                0,
                "Test1",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                0,
                "Test2",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                0,
                "Test3",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                0,
                "Test4",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                0,
                "Test5",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                0,
                "Test6",
                R.drawable.ic_send_dummy
            ),
        )
    }
}
