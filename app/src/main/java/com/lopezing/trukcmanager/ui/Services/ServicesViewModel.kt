package com.lopezing.trukcmanager.ui.Services

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ServicesViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply {
        value = "En este fragmento se mostrara y se podra editar cosas como pagos que se realicen, los ingresos y ademas se mostraran las cuentas de gastos totales"
    }
    val text: LiveData<String> = _text
}