package com.sopt.now.sopkathon.android.ui.naniseo

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.ActivityNaniseoBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingActivity
import com.sopt.now.sopkathon.android.ui.model.BottomNavItems

class NaniseoActivity : BindingActivity<ActivityNaniseoBinding>(R.layout.activity_naniseo) {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupNavHost()
    }

    private fun setupNavHost() {
        setupNavHostFragment()
        setupDestinationListener()
        setupBottomNavigation()
    }

    private fun setupNavHostFragment() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcv_naniseo) as NavHostFragment?
                ?: return
        navController = navHostFragment.navController
    }

    private fun setupDestinationListener() {
        navController.addOnDestinationChangedListener { _: NavController?, destination: NavDestination, _: Bundle? ->
            changeVisibilityOfBottomNav(destination)
        }
    }

    private fun changeVisibilityOfBottomNav(destination: NavDestination) {
        if (destination.id in BottomNavItems.bottomNavItems) {
            binding.bnvNaniseo.visibility = View.VISIBLE
        } else {
            binding.bnvNaniseo.visibility = View.GONE
        }
    }

    private fun setupBottomNavigation() {
        binding.bnvNaniseo.setupWithNavController(navController)
        binding.bnvNaniseo.setOnItemSelectedListener { item ->
            NavigationUI.onNavDestinationSelected(item, navController)
            return@setOnItemSelectedListener true
        }
    }
}