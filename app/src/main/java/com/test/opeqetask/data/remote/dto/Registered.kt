package com.test.opeqetask.data.remote.dto
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Registered(
    val age: Int,
    val date: String
):Parcelable