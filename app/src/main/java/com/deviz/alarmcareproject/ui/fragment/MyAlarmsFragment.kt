package com.deviz.alarmcareproject.ui.fragment

import com.deviz.alarmcareproject.R
import com.deviz.alarmcareproject.base.BaseFragment
import com.deviz.alarmcareproject.databinding.FragmentMyAlarmsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyAlarmsFragment : BaseFragment<FragmentMyAlarmsBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_my_alarms
}