package com.deviz.alarmcareproject.ui.fragment


import com.deviz.alarmcareproject.R
import com.deviz.alarmcareproject.base.BaseFragment
import com.deviz.alarmcareproject.databinding.FragmentFriendAlarmsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FriendAlarmsFragment : BaseFragment<FragmentFriendAlarmsBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_friend_alarms
}