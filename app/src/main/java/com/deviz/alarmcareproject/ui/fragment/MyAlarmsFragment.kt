package com.deviz.alarmcareproject.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.deviz.alarmcareproject.R
import com.deviz.alarmcareproject.adapter.MyAlarmsListAdapter
import com.deviz.alarmcareproject.base.BaseFragment
import com.deviz.alarmcareproject.databinding.FragmentMyAlarmsBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MyAlarmsFragment : BaseFragment<FragmentMyAlarmsBinding>() {
    override val layoutResourceId: Int
        get() = R.layout.fragment_my_alarms

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMyAlarmsRecyclerView()
    }

    private fun setupMyAlarmsRecyclerView() {
        val adapter = MyAlarmsListAdapter(viewDataBinding)
        viewDataBinding.myAlarmsRecyclerview.adapter = adapter
        viewDataBinding.myAlarmsRecyclerview.layoutManager = LinearLayoutManager(context)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("is_destroy : myAlarmsFragment")
    }
}