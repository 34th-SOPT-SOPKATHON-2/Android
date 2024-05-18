package com.sopt.now.sopkathon.android.ui.myPage

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentMyPageBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class MyPageFragment : BindingFragment<FragmentMyPageBinding>(R.layout.fragment_my_page) {
    private val myPageViewModel: MyPageViewModel by viewModels()
    private lateinit var myPageAdapter: MyPageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        myPageViewModel.updateProfile()

        myPageViewModel.profile.observe(viewLifecycleOwner) {
            Log.d("MyPageFragmentTest", "profile: $it")
            binding.tvMyPageName.text = it.nickName
            binding.tvMyPageTagTitle.text =
                getString(R.string.my_page_tag_title, it.nickName)
            binding.tvMyPageTotalZero.text =
                getString(R.string.my_page_total_zero, it.totalZeroCount)
        }
    }

    private fun initAdapter() {
        myPageAdapter = MyPageAdapter()
        binding.rvMyPage.adapter = myPageAdapter
        binding.rvMyPage.layoutManager = LinearLayoutManager(requireContext())
        myPageViewModel.badge.observe(viewLifecycleOwner) {
            myPageAdapter.submitList(it)
        }
    }


}
