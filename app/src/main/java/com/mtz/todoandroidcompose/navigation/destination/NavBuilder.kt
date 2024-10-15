package com.mtz.todoandroidcompose.navigation.destination

import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mtz.todoandroidcompose.ui.theme.screen.list.ListScreen
import com.mtz.todoandroidcompose.util.Constant

fun NavGraphBuilder.listComposable(
    navigationToScreen: (Int) -> Unit
) {

    composable(
        route = Constant.LIST_SCREEN,
        arguments = listOf(
            navArgument(Constant.LIST_ARG_KEY) {
                type = NavType.StringType
            })
    ) {
        ListScreen(navigationToScreen)
    }
}

fun NavGraphBuilder.taskComposable(
) {

    composable(
        route = Constant.TASK_SCREEN
    ) {
        Text("task Screen")
    }
}