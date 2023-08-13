package com.example.composenavigation.ui

sealed class Screen(val route: String){
    object Home: Screen("Home_screen")
    object Detail: Screen("Detail_screen")
}
