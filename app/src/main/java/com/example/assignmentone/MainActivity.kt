package com.example.assignmentone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

class MainActivity : AppCompatActivity() {
    lateinit var username :EditText
    lateinit var password : EditText
    lateinit var login : Button
    lateinit var uName:TextView
    var modelClass: ModelClass = ModelClass()
    private val model: Livedata = Livedata()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.UserNAme)
        password = findViewById(R.id.password)
        login =findViewById(R.id.login)
        uName = findViewById<TextView>(R.id.tv_name)
        val liveData = MutableLiveData<String>()
        liveData.value = modelClass.username
        val nameObserver = Observer<String> { newName ->

            uName.text = newName
        }
        model.currentName.observe(this, nameObserver)

        login.setOnClickListener {
            var intent = Intent(this,SecondActivity::class.java)
            modelClass.username = username.text.toString()
            modelClass.password = password.text.toString()
            model.currentName.setValue(modelClass.username)

//            intent.putExtra("USERNAME",modelClass.username)
//            intent.putExtra("PASSWORD",modelClass.password)
//            intent.putExtra("USERNAME",modelClass.username)
//            intent.putExtra("PASSWORD",modelClass.password)

//            intent.putExtra("RESPONSE",modelClass) //Just use putExta
//              startActivity(intent)intent

        }



        // Here, Just add a dynamic text view like Hi, <the name you typed>
        // It should change for each your character input , use livdata ookk
        // Just declare a liveData of type string,
        // You can set the value to livedata directly from XML o
        // Observe it, change the .text of TextView thATS IT?
        // Yeah, okay thankyou sooooooo muchhhh
        // You are welcome..  so thats it for today
        // time to sleep ok sir good night
        // Just call me Ruthwik :P okay ;)
        // Bye bye
    }
}
