package com.sopt.now.sopkathon.android.ui.sendQuestion

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendQuestionViewModel : ViewModel() {

    private var _selectedCategory = MutableLiveData<String>()
    val selectedCategory: LiveData<String> get() = _selectedCategory

    fun setCategory(selected: String) {
        _selectedCategory.value = selected
    }
}