package com.id.basicviewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val count = MutableLiveData(0)

    fun increment() {
        count.value = (count.value?: 0).plus(1)
    }
}
