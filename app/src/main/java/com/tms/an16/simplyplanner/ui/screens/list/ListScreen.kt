package com.tms.an16.simplyplanner.ui.screens.list

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(
    navigateToTaskScreen: (Int) -> Unit
) {

    Scaffold(
        content = { padding ->


        },
        floatingActionButton = {

        })

}

@Composable
fun ListFab() {
    FloatingActionButton(onClick = {}) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add button")
    }
}

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen(navigateToTaskScreen = {})
}