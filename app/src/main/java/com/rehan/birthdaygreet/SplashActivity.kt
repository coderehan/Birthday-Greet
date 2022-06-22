package com.rehan.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        //we have to pass 2 parameters in postDelayed(Runnable, time) method
       Handler().postDelayed({
           val intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
           finish()
       }, 3000)

    }
}