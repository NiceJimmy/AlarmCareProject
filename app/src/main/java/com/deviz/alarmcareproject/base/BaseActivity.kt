package com.deviz.alarmcareproject.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import timber.log.Timber

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {
    private val TAG = "BaseActivity"
    protected lateinit var binding: T

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun initView()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${javaClass.simpleName}: onCreate")
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding.lifecycleOwner = this

        initView()
    }



    override fun onStart() {
        super.onStart()
        Timber.d("${javaClass.simpleName}: onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("${javaClass.simpleName}: onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("${javaClass.simpleName}: onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("${javaClass.simpleName}: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("${javaClass.simpleName}: onDestroy")
    }
}