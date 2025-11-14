package com.example.gs2

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Menu : Screen("menu")
    object Imc : Screen("imc")
    object Equipe : Screen("equipe")
}
