package com.lopezing.trukcmanager.ui.Viajes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViajesViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "En ste fragmento se mostraran los viajes realizados"
    }
    val text: LiveData<String> = _text
}