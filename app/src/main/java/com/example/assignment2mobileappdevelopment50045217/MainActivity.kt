package com.example.assignment2mobileappdevelopment50045217

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.rounded.Help
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


import com.example.assignment2mobileappdevelopment50045217.ui.theme.Assignment2MobileAppDevelopment50045217Theme
import com.example.assignment2mobileappdevelopment50045217.ui.theme.SBGrey
import com.example.assignment2mobileappdevelopment50045217.ui.theme.SBOffWhite

import com.example.assignment2mobileappdevelopment50045217.ui.theme.SercPink


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Assignment2MobileAppDevelopment50045217Theme {

                // A surface container using the 'background' colour from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    BottomAppBar()
                }
            }
        }
    }


}


@Composable
fun BottomAppBar() {
    //val secondaryColor = Color.Gray
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Rounded.Home)
    }

    Scaffold(
        bottomBar = {
            androidx.compose.material3.BottomAppBar(
                containerColor = SBOffWhite

            ) {
                IconButton(
                    onClick = {
                        selected.value = Icons.Rounded.Home
                        navigationController.navigate(Screens.Home.screen) {
                            popUpTo(0)
                        }
                    }
                ) {
                    Icon(
                        imageVector = if (selected.value == Icons.Rounded.Home) {
                            Icons.Rounded.Home
                        } else {
                            Icons.Outlined.Home // Change to the outline version when not selected
                        },
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),


                        )
                }

                Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                IconButton(
                    onClick = {
                        selected.value = Icons.Rounded.ShoppingBag
                        navigationController.navigate(Screens.Catalogue.screen) {
                            popUpTo(0)
                        }
                    }
                ) {
                    Icon(
                        imageVector = if (selected.value == Icons.Rounded.ShoppingBag) {
                            Icons.Rounded.ShoppingBag
                        } else {
                            Icons.Outlined.ShoppingBag // Change to the outline version when not selected
                        },
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                    )
                }

                Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                IconButton(
                    onClick = {
                        selected.value = Icons.Filled.Help
                        navigationController.navigate(Screens.Help.screen) {
                            popUpTo(0)
                        }
                    }
                ) {
                    Icon(
                        imageVector = if (selected.value == Icons.Filled.Help) {
                            Icons.Rounded.Help
                        } else {
                            Icons.Outlined.HelpOutline// Change to the outline version when not selected
                        },
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                    )
                }

                Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                IconButton(
                    onClick = {
                        selected.value = Icons.Default.Mail
                        navigationController.navigate(Screens.Contact.screen) {
                            popUpTo(0)
                        }
                    }
                ) {
                    Icon(
                        imageVector = if (selected.value == Icons.Filled.Mail) {
                            Icons.Filled.Mail
                        } else {
                            Icons.Outlined.Mail // Change to the outline version when not selected
                        },
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                    )
                }

            }
        }

    ) { paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Home.screen) { Home() }
            composable(Screens.Catalogue.screen) { Catalogue() }
            composable(Screens.Help.screen) { Help() }
            composable(Screens.Contact.screen) { Contact() }
        }

    }
}

@Preview
@Composable
fun BottomAppBarPreview() {
    Assignment2MobileAppDevelopment50045217Theme {
        BottomAppBar()
    }
}



