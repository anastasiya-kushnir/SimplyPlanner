package com.tms.an16.simplyplanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tms.an16.simplyplanner.navigation.SetupNavigation
import com.tms.an16.simplyplanner.ui.theme.SimplyPlannerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimplyPlannerTheme {
                navController = rememberNavController()
                SetupNavigation(navController)

            }
        }
    }
}