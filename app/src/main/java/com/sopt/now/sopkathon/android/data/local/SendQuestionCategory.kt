package com.sopt.now.sopkathon.android.data.local

import com.sopt.now.sopkathon.android.R

data class SendQuestionCategory(
    val category: String,
    val icon: Int,
) {
    companion object {
        val sendQuestionCategories = listOf(
            SendQuestionCategory(
                "말투",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                "정산",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                "(안)읽씹",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                "약속",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                "축하",
                R.drawable.ic_send_dummy
            ),
            SendQuestionCategory(
                "지각",
                R.drawable.ic_send_dummy
            ),
        )
    }
}
