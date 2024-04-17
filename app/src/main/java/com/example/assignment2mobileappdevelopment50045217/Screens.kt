package com.example.assignment2mobileappdevelopment50045217

sealed class Screens (val screen: String) {
    data object Home : Screens("home")
    data object Catalogue : Screens("catalogue")
    data object Help : Screens("help")
    data object Contact : Screens("contact")
}