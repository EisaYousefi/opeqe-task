package com.test.opeqetask.data.repository

import com.test.opeqetask.data.remote.OpeqeApi
import com.test.opeqetask.data.remote.dto.OpeqesDto
import com.test.opeqetask.domin.reposetory.OpeqeRepository
import javax.inject.Inject

class OpeqeReporitoryImpl @Inject constructor(val api:OpeqeApi):OpeqeRepository {
    override suspend fun getOpeqes(): OpeqesDto=api.getOpeqes();
}