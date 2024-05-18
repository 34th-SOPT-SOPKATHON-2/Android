package com.sopt.now.sopkathon.android.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentSplashBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BindingFragment<FragmentSplashBinding>(R.layout.fragment_splash) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            lifecycleScope.launch {
                delay(2000)
                findNavController().navigate(R.id.fragment_friend_list)
            }
    }

}