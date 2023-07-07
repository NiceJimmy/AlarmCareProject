package com.deviz.alarmcareproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.deviz.alarmcareproject.databinding.ViewholderAlarmItemBinding
import com.deviz.alarmcareproject.ui.viewholder.MyAlarmsListViewHolder
import com.deviz.alarmcareproject.viewmodel.MyAlarmsViewModel

class MyAlarmsListAdapter(val binding: ViewDataBinding): RecyclerView.Adapter<MyAlarmsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAlarmsListViewHolder {
        val binding = ViewholderAlarmItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyAlarmsListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyAlarmsListViewHolder, position: Int) {
                holder.bind()
    }

    override fun getItemCount(): Int = 5

}