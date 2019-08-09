package com.gload.ecommerce

import android.app.Application
import android.support.v4.app.FragmentManager

class EcommerceApplication : Application() {

    lateinit var instance: EcommerceApplication

//    var fragmentManager: FragmentManager? = null
//        get() = this.fragmentManager
//        set(value) {
//            field = value
//        }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

//    fun getFragmentManager(): FragmentManager {
//        return fragmentManager
//    }

//    fun setFragmentManager(fm : FragmentManager) {
//        fragmentManager = fm
//    }

}