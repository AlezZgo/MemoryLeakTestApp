package com.example.memoryleaktestapp

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    val ld = MutableLiveData<Int>()

    val list = mutableListOf<Activity>()

}