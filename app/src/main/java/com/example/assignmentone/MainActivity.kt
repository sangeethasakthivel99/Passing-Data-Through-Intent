package com.example.assignmentone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var username :EditText
    lateinit var password : EditText
    lateinit var login : Button
    var modelClass: ModelClass = ModelClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.UserNAme)
        password = findViewById(R.id.password)
        login =findViewById(R.id.login)

        login.setOnClickListener {
            var intent = Intent(this,SecondActivity::class.java)
            modelClass.username = username.text.toString()
            modelClass.password = password.text.toString()
            intent.putExtra("USERNAME",modelClass.username)
            intent.putExtra("PASSWORD",modelClass.password)
            startActivity(intent)

        }
    }
}
