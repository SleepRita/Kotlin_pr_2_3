package com.example.kotlin_pr2

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _fragmentheader = MutableLiveData<String>()
    val header: LiveData<String> = _fragmentheader

    fun set_header_text(str: String){
        _fragmentheader.value = str
        Log.d("smth", "LOOOG${header.value}")
    }
}