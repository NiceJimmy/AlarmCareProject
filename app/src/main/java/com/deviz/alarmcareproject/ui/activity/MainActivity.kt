package com.deviz.alarmcareproject.ui.activity

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.deviz.alarmcareproject.ui.fragment.FriendAlarmsFragment
import com.deviz.alarmcareproject.ui.fragment.MyAlarmsFragment
import com.deviz.alarmcareproject.R
import com.deviz.alarmcareproject.base.BaseActivity
import com.deviz.alarmcareproject.databinding.ActivityMainBinding
import com.deviz.alarmcareproject.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val viewModel: MainViewModel by viewModels()
    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        initNavigationBar()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.viewmodel = viewModel
        binding.viewmodel?.apply {
            isQuickMenuClicked.observe(this@MainActivity) {
                Timber.d("check_menu : $it")
                if (!it) {
                    showQuickMenu()
                } else {
                    hideQuickMenu()
                }
            }
        }
    }

    private fun initNavigationBar() {
        binding.btmNav.run {
            setOnItemSelectedListener {
                Timber.d("check_fragment : ${it.itemId}")
                when(it.itemId) {
                    R.id.navigation_my_alarms -> {
                        changeFragment(MyAlarmsFragment())
                    }
                    R.id.navigation_friend_alarms -> {
                        changeFragment(FriendAlarmsFragment())
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
            .disallowAddToBackStack()  // 이전 프래그먼트를 백스택에 추가하지 않도록 합니다.
            .commit()
    }

    fun showQuickMenu() {
        binding.apply {
            containerQuickmenu.visibility = View.VISIBLE
            quickmenu.animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.riseup)
            quickmenu.visibility = View.VISIBLE
        }
    }

    fun hideQuickMenu() {
        binding.apply {
            containerQuickmenu.visibility = View.INVISIBLE
            quickmenu.visibility = View.INVISIBLE
        }
    }



}