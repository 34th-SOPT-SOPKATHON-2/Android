package com.sopt.now.sopkathon.android.ui.sendQuestion

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sopt.now.sopkathon.android.data.ServicePool
import kotlinx.coroutines.launch

class SendQuestionViewModel : ViewModel() {

    private var _selectedCategory = MutableLiveData<String>()
    val selectedCategory: LiveData<String> get() = _selectedCategory

    private var _questions = MutableLiveData<List<String>>()
    val questions: LiveData<List<String>> get() = _questions
    private var _selectedQuestion = MutableLiveData<String>()
    val selectedQuestion: LiveData<String> get() = _selectedQuestion

    fun setCategory(selected: String) {
        _selectedCategory.value = selected
    }

    fun getQuestions() {
        viewModelScope.launch {
            runCatching {
                ServicePool.naniseoService.getAnswerList()
            }.onSuccess {
                _questions.value = it.body()?.data?.answerList
            }.onFailure {
                Log.e("SplashViewModel", "postLogin Error: ${it.message}")
            }
        }
    }

    fun setQuestion(selected: String) {
        _selectedQuestion.value = selected
    }
}