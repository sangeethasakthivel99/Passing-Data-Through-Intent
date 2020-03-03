package com.example.assignmentone

import androidx.databinding.BaseObservable

class Databinding(userName:String, password:String) : BaseObservable() {
    private lateinit var username : String
    private lateinit var Password : String

    init {
        username = userName
        Password = password
    }

}