package com.test.opeqetask.presentation.opeqeDetail

import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.skydoves.landscapist.glide.GlideImage
import com.test.opeqetask.data.remote.dto.Result
import com.test.opeqetask.presentation.opeqeItems.OpeqeViewModel
import java.io.Serializable

@Composable
fun OpeqeDetail(
 result: Result?=null
) {

 Log.i("Eisa ", "OpeqeScreen===>: ${result?.name?.first}")

}