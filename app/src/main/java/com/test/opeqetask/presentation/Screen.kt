package com.test.opeqetask.presentation

sealed class Screen(val route: String) {
    object OpeqesScreen : Screen("opeqesScreen")
    object OpeqeDetailScreen : Screen("detailScreen/{result}")

}
