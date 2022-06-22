package com.rehan.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.rehan.birthdaygreet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var btnCreateBirthdayCard: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        btnCreateBirthdayCard = findViewById(R.id.btnCreateBirthdayCard)

        btnCreateBirthdayCard.setOnClickListener(View.OnClickListener {
            validation()
        })
    }

    private fun validation() {
        val name = etName.editableText.toString()

        if (name.isEmpty()) {
            etName.error = "Name is required"
            etName.requestFocus()
        } else {
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            //passing edittext data from this source activity to destination activity in key/value pair
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}