package com.erdin.kotlinprojectbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setDisplayShowTitleEnabled(true)
        title = "Profile"

        val bundle = intent.extras
        tv_fullname.text = bundle?.getString("fullname") ?: "Your Name"
        tv_email.text = bundle?.getString("email") ?: "Your Email"
        tv_username.text = bundle?.getString("username") ?: "Your Username"

    }
}
