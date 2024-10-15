package com.mtz.todoandroidcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.mtz.todoandroidcompose.navigation.destination.listComposable
import com.mtz.todoandroidcompose.navigation.destination.taskComposable
import com.mtz.todoandroidcompose.util.Constant


@Composable
fun SetupNavigation(navController: NavHostController) {
    val screen = remember {
        Screens(navController)
    }
    NavHost(
        navController = navController,
        startDestination = Constant.LIST_SCREEN
    ) {
        listComposable(navigationToScreen = screen.task)
        taskComposable()
    }
}