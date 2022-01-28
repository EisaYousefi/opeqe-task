package com.test.opeqetask.data.remote.dto
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Street(
    val number :Int,
    val name:String
):Parcelable
