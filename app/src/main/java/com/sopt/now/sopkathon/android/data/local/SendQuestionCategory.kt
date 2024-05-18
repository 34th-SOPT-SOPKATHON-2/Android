package com.sopt.now.sopkathon.android.data.local

import com.sopt.now.sopkathon.android.R

data class SendQuestionCategory(
    val category: String,
    val icon: Int,
    val hash: String
) {
    companion object {
        val sendQuestionCategories = listOf(
            SendQuestionCategory(
                "지각",
                R.drawable.ic_send_question_late,
                "#E5E8EB"
            ),
            SendQuestionCategory(
                "읽씹",
                R.drawable.ic_send_question_ignore,
                "#FFFBA7"
            ),
            SendQuestionCategory(
                "정산",
                R.drawable.ic_send_question_pay,
                "#EED4FF"
            ),
            SendQuestionCategory(
                "약속",
                R.drawable.ic_send_question_appointment,
                "#FFF5ED"
            ),
            SendQuestionCategory(
                "축하",
                R.drawable.ic_send_question_congratulate,
                "#D6E4FF"
            ),
            SendQuestionCategory(
                "말투",
                R.drawable.ic_chat,
                "#C8C8C8"
            ),
        )
    }
}
