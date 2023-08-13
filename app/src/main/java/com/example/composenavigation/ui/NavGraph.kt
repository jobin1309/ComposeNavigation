package com.example.composenavigation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun setupNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,

        ) {
        composable(
            route = Screen.Home.route
        ) {
            homeScreen(navController = navController)
        }
        composable(route = Screen.Detail.route) {

            detailsScreen(navController = navController)
        }

    }
}