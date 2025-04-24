package com.example.nihongo10minutes.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object WordCard : Screen("word_card")
    object Quiz : Screen("quiz")
    object Grammar : Screen("grammar")
    object MyPage : Screen("my_page")
} 