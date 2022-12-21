package com.example.pmdm22_examen_1t.navigation

sealed class Screens(val route: String){
    object MainScreen: Screens("initial_screen")
    object Ejercicio01: Screens("ej01")
    object Ejercicio02: Screens("ej02")
    object Ejercicio03: Screens("ej03")

}
