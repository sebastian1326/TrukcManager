package com.lopezing.trukcmanager.ui.Mantenimiento

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MantenimientoViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Este fragmento contendra los mantenimientos realizados y se podra agragar otro de igual manera"
    }
    val text: LiveData<String> = _text
}