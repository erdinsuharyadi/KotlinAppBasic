package com.erdin.kotlinprojectbasic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var bundles : Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)

        bundles = intent.extras!!
        val datEmail = bundles?.getString("email")
        val datPassword = bundles?.getString("password")

        val bLogin = findViewById<Button>(R.id.b_login)

        bLogin.setOnClickListener {

            if (datEmail.equals(etEmail.text.toString()) && datPassword.equals(etPassword.text.toString())) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtras(bundles)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Email & Password is wrong", Toast.LENGTH_SHORT).show()
            }
        }

        tv_dontacc.setOnClickListener {
            val intent2 = Intent(this, RegisterActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}