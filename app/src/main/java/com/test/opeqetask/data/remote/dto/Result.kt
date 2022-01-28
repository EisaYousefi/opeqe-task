package com.test.opeqetask.data.remote.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    val gender: String,
    val name: Name,
    val location: Location,
    val email: String,
    val cell: String,
    val dob: Dob,
    val id: Id,
    val login: Login,
    val nat: String,
    val phone: String,
    val picture: Picture,
    val registered: Registered
):Parcelable