package com.deviz.alarmcareproject.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.deviz.alarmcareproject.databinding.ViewholderAlarmItemBinding

class MyAlarmsListViewHolder(private val binding: ViewholderAlarmItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind() {
        binding.titleTxt.text = "testtest"
        binding.consineeInfoTxt.text = "asdfasdadfasd"
    }
}