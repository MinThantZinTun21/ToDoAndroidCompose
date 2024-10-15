package com.mtz.todoandroidcompose.navigation

import androidx.navigation.NavHostController
import com.mtz.todoandroidcompose.util.Action
import com.mtz.todoandroidcompose.util.Constant

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(Constant.LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("list/$taskId") {
        }
    }

}