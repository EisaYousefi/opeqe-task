package com.test.opeqetask.presentation.opeqeItems

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.opeqetask.common.Resource
import com.test.opeqetask.domin.usecase.GetOpeqeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class OpeqeViewModel @Inject constructor(
    val getOpeqeUseCase: GetOpeqeUseCase
) : ViewModel() {

    private val _state = mutableStateOf(OpeqesState())
    val state: State<OpeqesState> = _state

    init {
        getOpeqes()
    }

    private fun getOpeqes() {
       getOpeqeUseCase().onEach { result->
           when(result){
               is Resource.Success ->{
                   _state.value = OpeqesState(opeqes = result.data)
               }
               is Resource.Error ->{
                   _state.value = OpeqesState(error = result.message?:"Error")
               }
               is Resource.Loading ->{
                   _state.value = OpeqesState(isLoading = true)
               }
           }
       }.launchIn(viewModelScope)
    }
}