package com.test.opeqetask.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.test.opeqetask.data.remote.dto.Result
import com.test.opeqetask.presentation.compose.theme.OpeqeTheme
import com.test.opeqetask.presentation.opeqeDetail.OpeqeDetail
import com.test.opeqetask.presentation.opeqeItems.OpeqeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            OpeqeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination =Screen.OpeqesScreen.route
                    ) {
                        composable(route = Screen.OpeqesScreen.route) {
                            OpeqeScreen(navController=navController)
                        }
                        composable(
                            route = Screen.OpeqeDetailScreen.route,
                            arguments = listOf(
                                navArgument("result") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            backStackEntry.arguments?.getString("result")?.let {json->
                                var result = Gson().fromJson(json, Result::class.java)
                                OpeqeDetail(result = result)
                            }


                        }
                    }
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OpeqeTheme {
        Greeting("Android")
    }
}