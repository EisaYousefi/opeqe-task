package com.test.opeqetask.domin.usecase

import com.test.opeqetask.common.Resource
import com.test.opeqetask.data.remote.dto.toOpeqes
import com.test.opeqetask.domin.model.Opeqes
import com.test.opeqetask.domin.reposetory.OpeqeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetOpeqeUseCase @Inject constructor(private val repository: OpeqeRepository) {
    operator fun invoke():Flow<Resource<Opeqes>> = flow {
        try {
            emit(Resource.Loading())
            val opeqes = repository.getOpeqes().toOpeqes()
            emit(Resource.Success(opeqes))
        }catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage?:"Error"))
        }catch (e:IOException){
            emit(Resource.Error("Check internet connection"))
        }
    }
}