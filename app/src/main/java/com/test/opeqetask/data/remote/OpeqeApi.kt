package com.test.opeqetask.data.remote

import com.test.opeqetask.data.remote.dto.OpeqesDto
import retrofit2.http.GET

interface OpeqeApi {

    @GET("api")
    suspend fun getOpeqes():OpeqesDto
}