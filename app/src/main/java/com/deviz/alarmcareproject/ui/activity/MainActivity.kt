package com.deviz.alarmcareproject.ui.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.deviz.alarmcareproject.ui.fragment.FriendAlarmsFragment
import com.deviz.alarmcareproject.ui.fragment.MyAlarmsFragment
import com.deviz.alarmcareproject.R
import com.deviz.alarmcareproject.base.BaseActivity
import com.deviz.alarmcareproject.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val myAlarmsFragment by lazy { MyAlarmsFragment() }
    private val friendAlarmsFragment by lazy { FriendAlarmsFragment() }
    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        initNavigationBar()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun initNavigationBar() {
        binding.btmNav.run {
            setOnItemSelectedListener {
                Timber.d("check_fragment : ${it.itemId}")
                when(it.itemId) {
                    R.id.navigation_my_alarms -> {
                        changeFragment(myAlarmsFragment)
                    }
                    R.id.navigation_friend_alarms -> {
                        changeFragment(friendAlarmsFragment)
                    }
                }
                true
            }
            selectedItemId = R.id.navigation_my_alarms
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.nav_host_fragment_activity_main, fragment)
            .commit()
    }



}