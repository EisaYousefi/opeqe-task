package com.test.opeqetask.presentation.opeqeItems

import com.test.opeqetask.domin.model.Opeqes

data class OpeqesState(
    val isLoading : Boolean = false,
    val opeqes: Opeqes?=null,
    val error:String=""
)
