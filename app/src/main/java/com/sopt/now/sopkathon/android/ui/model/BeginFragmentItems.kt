package com.sopt.now.sopkathon.android.ui.model

import com.sopt.now.sopkathon.android.R

enum class BeginFragmentItems(val id: Int) {
    SPLASH(R.id.fragment_splash), SET_NICKNAME(R.id.fragment_set_nickname);

    companion object {
        val beginFragmentItems = listOf(SPLASH.id, SET_NICKNAME.id)
    }
}