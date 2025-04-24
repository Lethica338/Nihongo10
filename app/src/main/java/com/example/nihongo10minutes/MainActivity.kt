package com.example.nihongo10minutes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nihongo10minutes.navigation.Screen
import com.example.nihongo10minutes.ui.screens.*
import com.example.nihongo10minutes.ui.theme.Nihongo10minutesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Nihongo10minutesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.Home.route
                    ) {
                        composable(Screen.Home.route) {
                            HomeScreen(navController)
                        }
                        composable(Screen.WordCard.route) {
                            WordCardScreen(navController)
                        }
                        composable(Screen.Quiz.route) {
                            QuizScreen(navController)
                        }
                        composable(Screen.Grammar.route) {
                            GrammarScreen(navController)
                        }
                        composable(Screen.MyPage.route) {
                            MyPageScreen(navController)
                        }
                    }
                }
            }
        }
    }
}