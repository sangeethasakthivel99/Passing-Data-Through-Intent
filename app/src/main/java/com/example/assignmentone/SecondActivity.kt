package com.example.assignmentone

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.assignmentone.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    private lateinit var secondMainBinding : ActivitySecondBinding
private lateinit var model : Livedata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // loginViewModel = ViewModelProviders.of(this@SecondActivity).get(LoginViewModel::class.java)
//        model = activity?.run {
//            ViewModelProviders.of(this).get(Livedata::class.java)
//        } ?: throw Exception("Invalid Activity")
//        model.data.observe(this, Observer<ClipData.Item> { item ->
//            // Update the UI
//        })
        // Here we init the view model, always use the same code above, just change the variables and type
        secondMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_second)
        //same, getting the binding variable, means the entire layout okay
        // we can access any Ui element using binding okk
        //even viewmodel, yeah okk
        //Next the apply function is just a kotlin thing okay
        // we can use secondMainBinding.viewModel = loginViewModel
        // both are almost same, some advanced topics, will teach you later :) okkk
        secondMainBinding.apply {
            viewModel = loginViewModel // Here we set view model to XML
            // so from now on loginView model is XMLs viewModel i got it
        }

        //Now we need to get data from intent and set it to XML just like we did for viewModel
        val userData: ModelClass = intent.getParcelableExtra("RESPONSE") // your task
        //then use this line
        secondMainBinding.userData = userData // so when ever we change the data in UserData, call this line to update?
        // yeah to update UI, we can also make use of LiveData, to do the same okk
        // Thats our next task
        //Live data ;(
        // Yes okay i need to learn about that
        // Its just a data holder, like LiveData<Int>, LiveData<String> .. ok it can hold object as well? yeah okk
        // the thing is that its kind of observable, means we can observe it mmmm Rx Java?
        // Yeah, with some extra functions to manage life cycles okay
        // So when we observe, any changes that made on the livedata can be immedietly reflected
        // we dont need to manually refresh or re assign   in view model we need to update in live data it will update automatiically?
        // Yes, when we change the value in livedata, all of its observers get notified okay nice right
        // Yeah very useful, we dont need to manually check n refresh  but complex?
        // Once you are used to it, its kinda wowowow okay so my next task is live data
        // Yeah ill explain
        // Now we have the userdata here in this activity, right ?yes
        // Lets start from first screen

    }
}
