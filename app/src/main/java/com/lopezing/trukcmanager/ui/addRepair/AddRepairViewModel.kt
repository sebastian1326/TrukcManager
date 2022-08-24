package com.lopezing.trukcmanager.ui.addRepair

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddRepairViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "En este fragmento se podra agregar las refacciones que se le realizan al vehiculo, para poder llevar un registro"
    }
    val text: LiveData<String> = _text
    // TODO: Implement the ViewModel
}