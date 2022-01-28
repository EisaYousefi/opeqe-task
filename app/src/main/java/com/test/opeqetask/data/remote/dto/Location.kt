package com.test.opeqetask.data.remote.dto
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Location(
    val city: String,
    val state: String,
    val country:String,
    val postcode: String,
    val street: Street,

    val coordinates: Coordinates,
    val timezone: Timezone
):Parcelable