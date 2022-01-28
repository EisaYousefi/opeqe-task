package com.test.opeqetask.data.remote.dto
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Timezone(
    val description: String,
    val offset: String
):Parcelable