package com.kihoro.extrack.ui.theme.nav

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.kihoro.extrack.ui.theme.screens.LoginScreen.LogIn
import com.kihoro.extrack.ui.theme.screens.LoginScreen.LogInKt.onLogin.LogIn

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String="login") {
    NavHost(navController = navController, modifier=modifier,
        startDestination = startDestination){
        composable(com.kihoro.extrack.ui.theme.nav.ROUTE_LOGIN){
            LogIn(navController)
        }
    }
}