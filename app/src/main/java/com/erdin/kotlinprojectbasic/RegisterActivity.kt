package com.erdin.kotlinprojectbasic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etFullname = findViewById<EditText>(R.id.et_name)
        val etUsername = findViewById<EditText>(R.id.et_username)
        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val etRegister = findViewById<Button>(R.id.b_register)
        val tvAlreadyAcc = findViewById<TextView>(R.id.tv_alreadyacc)

        val intent = Intent(this, LoginActivity::class.java)

        etRegister.setOnClickListener {
            val bundleRegister = Bundle()
            bundleRegister.putString("fullname", etFullname.text.toString())
            bundleRegister.putString("email", etEmail.text.toString())
            bundleRegister.putString("username", etUsername.text.toString())
            bundleRegister.putString("password", etPassword.text.toString())

            intent.putExtras(bundleRegister)
            startActivity(intent)
            finish()
        }

        tvAlreadyAcc.setOnClickListener {
            startActivity(intent)
            finish()
        }
    }
}