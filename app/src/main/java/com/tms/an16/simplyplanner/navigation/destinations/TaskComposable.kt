package com.tms.an16.simplyplanner.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tms.an16.simplyplanner.util.Action
import com.tms.an16.simplyplanner.util.Constants.LIST_ARGUMENT_KEY
import com.tms.an16.simplyplanner.util.Constants.LIST_SCREEN
import com.tms.an16.simplyplanner.util.Constants.TASK_ARGUMENT_KEY
import com.tms.an16.simplyplanner.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) {

    }
}