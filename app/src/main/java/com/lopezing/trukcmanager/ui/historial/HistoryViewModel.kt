package com.lopezing.trukcmanager.ui.historial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "ESte fragmento contendra el historial del vieje que esta en procesi"
    }
    val text: LiveData<String> = _text
}