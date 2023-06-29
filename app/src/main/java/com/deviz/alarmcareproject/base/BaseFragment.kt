package com.deviz.alarmcareproject.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import timber.log.Timber

abstract class BaseFragment<T : ViewDataBinding> : Fragment() {

    private val TAG = "BaseFragment"
    lateinit var binding: T

    abstract val layoutResourceId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${javaClass.simpleName}: onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Timber.d("${javaClass.simpleName}: onCreateView")
        binding = DataBindingUtil.inflate(inflater, layoutResourceId, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.d("${javaClass.simpleName}: onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Timber.d("${javaClass.simpleName}: onActivityCreated")
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

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("${javaClass.simpleName}: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("${javaClass.simpleName}: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Timber.d("${javaClass.simpleName}: onDetach")
    }
}