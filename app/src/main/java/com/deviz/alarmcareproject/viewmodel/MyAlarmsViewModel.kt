package com.deviz.alarmcareproject.viewmodel

import android.app.Application
import android.content.Context
import com.deviz.alarmcareproject.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyAlarmsViewModel @Inject constructor(application: Application): BaseViewModel(application){
}