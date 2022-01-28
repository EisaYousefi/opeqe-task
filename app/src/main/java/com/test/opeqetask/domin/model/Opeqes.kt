package com.test.opeqetask.domin.model

import com.test.opeqetask.data.remote.dto.Info
import com.test.opeqetask.data.remote.dto.Result

data class Opeqes(
    val info: Info,
    val results: List<Result> = emptyList()
)
