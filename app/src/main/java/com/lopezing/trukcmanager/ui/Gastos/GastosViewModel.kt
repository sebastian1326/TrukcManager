package com.lopezing.trukcmanager.ui.Gastos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GastosViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Este fragmento se a diseñado para contener los gastos por viaje del vehiculo"
    }
    val text: LiveData<String> = _text
}