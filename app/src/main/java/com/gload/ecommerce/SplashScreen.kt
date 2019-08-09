package com.gload.ecommerce

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SplashScreen : Fragment() {

    private var fragmentUtility = FragmentUtility()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_splash_creen, container, false);

        val hand = Handler()
        val run1 = Runnable {
            fragmentUtility.openMainFragment(fragmentUtility._LOGIN_SCREEN, fragmentUtility.LOGIN_SCREEN)
        }
        hand.postDelayed(run1, 3000)

        return view;
    }
}