package com.example.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel: ViewModel() {
    private val dataName = MutableLiveData<String>()

    val name: LiveData<String>
        get() = dataName

    fun setName(name: String){
        dataName.value = name
    }
}