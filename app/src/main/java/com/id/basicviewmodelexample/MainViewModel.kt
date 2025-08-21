package com.id.basicviewmodelexample

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel: ViewModel() {
    val count = MutableStateFlow(0)

    fun increment() {
        count.value += 1
    }
}
