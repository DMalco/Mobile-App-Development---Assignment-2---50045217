package com.example.assignment2mobileappdevelopment50045217

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.assignment2mobileappdevelopment50045217.ui.theme.Assignment2MobileAppDevelopment50045217Theme
import com.example.assignment2mobileappdevelopment50045217.ui.theme.SBLightGreen

@Composable
fun Contact() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier
            .fillMaxSize()
            .background(color = SBLightGreen)//CHANGE BACKGROUND COLOUR
            .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Contact", fontSize = 30.sp)
            Text(text = "Here's some Contact information about S&B", fontSize = 16.sp)
        }
    }
}

@Preview
@Composable
fun ContactPreview() {
    Assignment2MobileAppDevelopment50045217Theme {
        Contact()
    }
}
