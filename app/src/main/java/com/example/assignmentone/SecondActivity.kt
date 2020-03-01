package com.example.assignmentone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var tv_Username :TextView
    lateinit var tv_Password : TextView
    private lateinit var modelClass : ModelClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        tv_Username = findViewById(R.id.tv_username)
        tv_Password = findViewById(R.id.tv_Password)
        val username = intent?.extras?.get("USERNAME")
        val password = intent?.extras?.get("PASSWORD")
        tv_Username.text = username.toString()
        tv_Password.text = password.toString()
    }
}
