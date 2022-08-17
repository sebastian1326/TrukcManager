package com.lopezing.trukcmanager.ui.historial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Este fragmento contendra el historial del vieje que esta en proceso"
    }
    val text: LiveData<String> = _text
}