package com.test.opeqetask.presentation.compose.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.pagePaddings(): Modifier = padding(top = 16.dp, start = 16.dp, end = 16.dp)
fun Modifier.contentPaddings(horizontal: Dp = 16.dp): Modifier =
    padding(start = horizontal, end = horizontal, bottom = 16.dp)

fun Modifier.contentHorizontalPadding(): Modifier = padding(horizontal = 16.dp)
fun Modifier.bottomSheetPaddings(): Modifier = padding(start = 24.dp, end = 24.dp, bottom = 24.dp)
fun Modifier.cardPadding(): Modifier = padding(16.dp)