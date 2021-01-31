package com.joyredoc.newpromvvm

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.joyredoc.newpromvvm.databinding.ActivityMainBinding
import com.joyredoc.newpromvvm.tabactivity.TabActivity

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding.activity = this


    }


    fun onLogin()
    {

        binding.apply {

            var email = etEmail.text.toString()
            var emailPattern = Regex.escape("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
            var pass = etPass.text.toString()

            if (email.isEmpty())
            {
                Toast.makeText(this@MainActivity, "enter email", Toast.LENGTH_LONG).show()
                return
            }

            if (email.matches(emailPattern.toRegex()))
            {
                Toast.makeText(this@MainActivity, "email not match", Toast.LENGTH_LONG).show()
                return
            }

            if (pass.isEmpty())
            {
                Toast.makeText(this@MainActivity, "enter pass", Toast.LENGTH_LONG).show()
                return
            }

            gotoHome()

        }

    }

    private fun gotoHome() {

        val intent = Intent(this, TabActivity::class.java)
        startActivity(intent)

    }

}