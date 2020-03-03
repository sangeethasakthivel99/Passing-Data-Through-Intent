package com.example.assignmentone

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Livedata : ViewModel() {

    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

}