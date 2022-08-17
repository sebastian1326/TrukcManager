package com.lopezing.trukcmanager.ui.principal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PrincipalViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private val _text = MutableLiveData<String>().apply {
        value = "En este fragmento se mostrara la ventana principal, la cual contendra unas opciones para ingresar los datos solicitados para el cliente"
    }
    val text: LiveData<String> = _text
}