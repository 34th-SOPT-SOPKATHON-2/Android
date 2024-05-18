package com.sopt.now.sopkathon.android.ui.myPage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sopt.now.sopkathon.android.R
import com.sopt.now.sopkathon.android.databinding.FragmentMyPageBinding
import com.sopt.now.sopkathon.android.ui.common.base.BindingFragment

class MyPageFragment : BindingFragment<FragmentMyPageBinding>(R.layout.fragment_my_page) {
    private val myPageViewModel: MyPageViewModel by viewModels()
    private lateinit var myPageAdapter: MyPageAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        binding.tvMyPageName.text = myPageViewModel.profile.value?.name
        binding.tvMyPageTagTitle.text =
            getString(R.string.my_page_tag_title).format(myPageViewModel.profile.value?.name)
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
