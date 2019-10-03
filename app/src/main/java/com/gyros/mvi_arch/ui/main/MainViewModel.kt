package com.gyros.mvi_arch.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.gyros.mvi_arch.ui.main.state.MainStateEvent
import com.gyros.mvi_arch.ui.main.state.MainViewState
import com.gyros.mvi_arch.util.AbsentLiveData

class MainViewModel : ViewModel() {

    private val _stateEvent: MutableLiveData<MainStateEvent> = MutableLiveData()
    private val _viewState: MutableLiveData<MainViewState> = MutableLiveData()

    val viewState:LiveData<MainViewState> = _viewState

    val dataState: LiveData<MainViewState> = Transformations
        .switchMap(_stateEvent){ stateEvent->
            handleStateEvent(stateEvent)
    }

    fun handleStateEvent(stateEvent: MainStateEvent) : LiveData<MainViewState>{
        when(stateEvent){
            is MainStateEvent.GetBlogPostEvent -> {
                return AbsentLiveData.create()
            }
            is MainStateEvent.GetUserEvent -> {
                return AbsentLiveData.create()
            }
            is MainStateEvent.None -> {
                return AbsentLiveData.create()
            }
        }
    }
}