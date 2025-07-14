package com.tms.an16.simplyplanner.navigation

import androidx.navigation.NavHostController
import com.tms.an16.simplyplanner.util.Action
import com.tms.an16.simplyplanner.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {

    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}