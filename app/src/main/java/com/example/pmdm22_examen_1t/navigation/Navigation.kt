package com.example.pmdm22_examen_1t.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pmdm22_examen_1t.screens.*
import com.example.pmdm22_examen_1t.screens.ej01.Ej01Screen
import com.example.pmdm22_examen_1t.screens.ej02_tictactoe.Ej02Screen
import com.example.pmdm22_examen_1t.screens.ej03_calculadora.Ej03Screen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Ejercicio01.route) { Ej01Screen() }
        composable(route = Screens.Ejercicio02.route) { Ej02Screen() }
        composable(route = Screens.Ejercicio03.route) { Ej03Screen() }

    }
}

