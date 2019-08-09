package com.gload.ecommerce

import android.content.Context
import android.widget.Toast

class LogUtils {

    companion object {
        fun showDisplay(mActivity: Context?, str: String) {
            val toast = Toast.makeText(mActivity, str, Toast.LENGTH_LONG)
            toast.show()
        }
    }

}