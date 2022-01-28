package com.test.opeqetask.presentation

sealed class Screen(val route: String) {
    object OpeqesScreen : Screen("opeqes-screen")
    object OpeqeDetailScreen : Screen("opeqe-details-screen/{result}")

}
