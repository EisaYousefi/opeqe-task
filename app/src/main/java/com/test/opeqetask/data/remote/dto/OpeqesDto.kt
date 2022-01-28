package com.test.opeqetask.data.remote.dto

import com.test.opeqetask.domin.model.Opeqes

data class OpeqesDto(
    val info: Info,
    val results: List<Result>
)

fun OpeqesDto.toOpeqes():Opeqes{
    return Opeqes(
        info = info,
        results = results
    )
}

