package com.erdin.kotlinprojectbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_to_second_activity -> {
                Toast.makeText(this,"Activity 2", Toast.LENGTH_SHORT).show()
                return  true
            }
            R.id.action_toast -> {
                Toast.makeText(this,"Toast Baru", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
