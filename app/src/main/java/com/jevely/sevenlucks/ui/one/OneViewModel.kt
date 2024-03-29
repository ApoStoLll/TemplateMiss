package com.jevely.sevenlucks.ui.one

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jevely.sevenlucks.repository.IScoreRepository

class OneViewModel(val repository: IScoreRepository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}