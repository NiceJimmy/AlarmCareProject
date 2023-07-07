package com.deviz.alarmcareproject.ui.fragment


import android.os.Bundle
import android.view.View
import com.deviz.alarmcareproject.R
import com.deviz.alarmcareproject.base.BaseFragment
import com.deviz.alarmcareproject.databinding.FragmentFriendAlarmsBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class FriendAlarmsFragment : BaseFragment<FragmentFriendAlarmsBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_friend_alarms

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("is_destroy : friendAlarmsFragment")
    }

}