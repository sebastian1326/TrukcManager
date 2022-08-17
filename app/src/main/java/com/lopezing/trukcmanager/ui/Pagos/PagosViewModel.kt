package com.lopezing.trukcmanager.ui.Pagos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PagosViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "En ste fragmento se mostraran los pagos realizados por los clientes"
    }
    val text: LiveData<String> = _text
}