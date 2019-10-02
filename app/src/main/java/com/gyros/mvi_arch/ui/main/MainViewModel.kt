package com.gyros.mvi_arch.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gyros.mvi_arch.ui.main.state.MainViewState

class MainViewModel : ViewModel() {

    private val _viewState: MutableLiveData<MainViewState> = MutableLiveData()

    val viewState:LiveData<MainViewState> = _viewState
}