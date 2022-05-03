package com.example.mycontact

import com.example.mycontact.routing.PhoneNumberRouter
import com.example.mycontact.routing.Screen
import com.example.mycontact.viewmodel.MainViewModel
import com.example.mycontact.viewmodel.MainViewModelFactory



import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel


import com.example.mycontact.screens.ClosefriendScreen
import com.example.mycontact.screens.ContactScreen
import com.example.mycontact.screens.SaveContactScreen
import com.example.mycontact.screens.TrashScreen
import com.example.mycontact.ui.theme.MyContactTheme
import com.example.mycontact.ui.theme.MyContactThemeSettings

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyContactTheme(darkTheme = MyContactThemeSettings.isDarkThemeEnabled) {
                val viewModel: MainViewModel = viewModel(
                    factory = MainViewModelFactory(LocalContext.current.applicationContext as Application)
                )
                MainActivityScreen(viewModel)
            }
        }
    }
}


@ExperimentalMaterialApi
@Composable
fun MainActivityScreen(viewModel: MainViewModel) {
    Surface {
        when (PhoneNumberRouter.currentScreen) {
            is Screen.Contacts -> ContactScreen(viewModel)
            is Screen.SaveContact -> SaveContactScreen(viewModel)
            is Screen.Trash -> TrashScreen(viewModel)
            is Screen.Closefriend -> ClosefriendScreen(viewModel)
        }
    }
}