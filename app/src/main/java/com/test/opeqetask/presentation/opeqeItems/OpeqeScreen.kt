package com.test.opeqetask.presentation.opeqeItems

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.google.gson.Gson
import com.test.opeqetask.data.remote.dto.Result
import com.test.opeqetask.presentation.compose.theme.OpeqeTheme
import com.test.opeqetask.presentation.compose.theme.errorColor
import com.test.opeqetask.presentation.opeqeItems.components.OpeqesItem

@Composable
fun OpeqeScreen(
    navController: NavHostController,
    viewModel: OpeqeViewModel = hiltViewModel()
) {
    val state = viewModel.state.value

    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
        ) {
            state.opeqes?.let {
                items(it.results) { result ->
                    OpeqesItem(
                        result = result,
                        onItemClick = {
                           navigationToDetail(navController,result)
                        })
                }
            }
        }
        if (state.error.isNotBlank()) {
            Text(
                text = state.error,
                color = OpeqeTheme.colors.errorColor,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .align(Alignment.Center)
            )
        }
        if (state.isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }
}

fun navigationToDetail(navController: NavHostController,result: Result){
    val resultJson = Gson().toJson(result)
    navController.navigate(
        "detailScreen/$resultJson"
    )
}