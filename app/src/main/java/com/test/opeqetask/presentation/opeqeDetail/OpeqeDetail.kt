package com.test.opeqetask.presentation.opeqeDetail


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage
import com.test.opeqetask.data.remote.dto.Result

@Composable
fun OpeqeDetail(
    result: Result
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        GlideImage(
            modifier = Modifier
                .fillMaxWidth(),
            imageModel = result.picture.large,
            contentScale = ContentScale.Crop,
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = result.email, fontWeight = FontWeight.Bold)
            Text(text = result.phone, modifier = Modifier.padding(16.dp))
        }

    }
}



