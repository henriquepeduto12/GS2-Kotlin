package com.example.gs2_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "login"
            ) {
                composable("login")  { TelaLogin(navController) }
                composable("menu")   { TelaMenu(navController) }
                composable("imc")    { TelaIMC(navController) }
                composable("equipe") { TelaEquipe(navController) }
            }
        }
    }
}
