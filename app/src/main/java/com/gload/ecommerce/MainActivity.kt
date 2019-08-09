package com.gload.ecommerce

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var fragmentUtility = FragmentUtility()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FragmentUtility.setFragManager(supportFragmentManager)

        fragmentUtility.openMainFragment(fragmentUtility._SPLASH_SCREEN, fragmentUtility.SPLASH_SCREEN)

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        LogUtils.showDisplay(this, "Forgot Password")
    }
}
