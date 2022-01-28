package com.test.opeqetask.domin.reposetory

import com.test.opeqetask.data.remote.dto.OpeqesDto

interface OpeqeRepository {
    suspend fun getOpeqes():OpeqesDto
}