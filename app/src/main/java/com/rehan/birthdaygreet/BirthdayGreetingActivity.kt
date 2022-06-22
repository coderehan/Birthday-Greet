package com.rehan.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    private lateinit var tvName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        tvName = findViewById(R.id.tvName)

        //getting edittext data from source activity and displaying in this destination activity
        val name = intent.getStringExtra("name")
        tvName.text = "Happy Birthday \n $name"
    }
}