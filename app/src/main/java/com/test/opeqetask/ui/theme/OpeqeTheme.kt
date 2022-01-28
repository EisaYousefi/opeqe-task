package com.test.opeqetask.ui.theme
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection

@Composable
fun OpeqeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        OpeqeDarkColors
    } else {
        OpeqeLightColors
    }

    MaterialTheme(
        colors = colors,
        typography = OpeqeTypography,
        shapes = OpeqeShapes,
        content = content
    )
}

@Composable
fun OpeqePreview(content: @Composable ColumnScope.() -> Unit) {
    OpeqeTheme {
        Column(androidx.compose.ui.Modifier.background(OpeqeTheme.colors.background)) {
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                content()
            }
        }
    }
}


typealias OpeqeTheme = MaterialTheme