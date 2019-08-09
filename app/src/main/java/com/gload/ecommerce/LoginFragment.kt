package com.gload.ecommerce

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout


class LoginFragment : Fragment() {

    private var mActivity: Context? = null
    private lateinit var btnLogin: Button
    private lateinit var btnForgotPass: Button
    private lateinit var btnNewUser: Button
    private lateinit var editEmail: EditText
    private lateinit var editPass: EditText
    private lateinit var loginView: LinearLayout
    private var fragmentUtility = FragmentUtility()

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mActivity = context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        loginView = view.findViewById(R.id.loginView) as LinearLayout
        editEmail = view.findViewById(R.id.editEmail) as EditText
        editPass = view.findViewById(R.id.editPassword) as EditText
        btnLogin = view.findViewById(R.id.btnLogin) as Button
        btnForgotPass = view.findViewById(R.id.btnForgotPass) as Button
        btnNewUser = view.findViewById(R.id.btnNewUser) as Button

        btnLogin.setOnClickListener {
            if (editEmail.text.isBlank()) {
                LogUtils.showDisplay(mActivity, "Enter Email Address")
            } else if (!Patterns.EMAIL_ADDRESS.matcher(editEmail.text).matches()) {
                LogUtils.showDisplay(mActivity, "Enter Valid Email Address")
            } else if (editPass.text.isBlank()) {
                LogUtils.showDisplay(mActivity, "Enter Password")
            } else {

            }
        }

        btnNewUser.setOnClickListener {
            fragmentUtility.openMainFragment(fragmentUtility._REGISTER_SCREEN, fragmentUtility.REGISTER_SCREEN)
        }

        btnForgotPass.setOnClickListener {
            LogUtils.showDisplay(mActivity, "Forgot Password")
        }

        return view
    }

}