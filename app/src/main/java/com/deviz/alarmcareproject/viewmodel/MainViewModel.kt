package com.deviz.alarmcareproject.viewmodel

import android.app.Application
import android.content.Context
import androidx.core.content.contentValuesOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.deviz.alarmcareproject.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(application: Application): BaseViewModel(application) {

    private val _isQuickMenuClicked = MutableLiveData(false)
    val isQuickMenuClicked: LiveData<Boolean>
        get() = _isQuickMenuClicked


    fun tabQuickMenu() {
        _isQuickMenuClicked.value?.let {
            _isQuickMenuClicked.value = !it
        }
    }

}