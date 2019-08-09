package com.gload.ecommerce

import android.app.FragmentManager
import android.support.v4.app.FragmentManager

class FragmentUtility {

    // FRAGMENT CODE
    val _SPLASH_SCREEN: Int = 11
    val _LOGIN_SCREEN: Int = 12
    val _REGISTER_SCREEN: Int = 13

    // FRAGMENT NAME
    val SPLASH_SCREEN: String = "splash_screen"
    val LOGIN_SCREEN: String = "login_screen"
    val REGISTER_SCREEN: String = "register_screen"


    companion object {
        lateinit var fragmentManager: FragmentManager
        fun setFragManager(fm: FragmentManager) {
            fragmentManager = fm
        }
    }

    var childFragmentManager: FragmentManager? = null
        get() = this.childFragmentManager
        set(value) {
            field = value
        }

    fun openMainFragment(code: Int, fragName: String) {

        val fragment = when (code) {
            _SPLASH_SCREEN -> SplashScreen()
            _LOGIN_SCREEN -> LoginFragment()
            _REGISTER_SCREEN -> RegisterFragmant()
            else -> SplashScreen()
        }

        if (fragment != null) {
            val transaction = fragmentManager?.beginTransaction()

            // Replace the fragment on container
            transaction?.replace(R.id.frameLayout, fragment)
            transaction?.addToBackStack(fragName)

            // Finishing the transition
            transaction?.commitAllowingStateLoss()
        }
    }
}