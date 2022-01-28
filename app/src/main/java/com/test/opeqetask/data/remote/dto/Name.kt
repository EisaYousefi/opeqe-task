package com.test.opeqetask.data.remote.dto

import com.google.gson.annotations.SerializedName

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Name(
    val first: String,
    val last: String,
    val title: String
):Parcelable