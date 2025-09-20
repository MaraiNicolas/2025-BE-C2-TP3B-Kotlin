package com.ort.prueba.aplicacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ort.prueba.aplicacion.screen.LoginScreen
import com.ort.prueba.aplicacion.screen.RegisterScreen
import com.ort.prueba.aplicacion.screen.WelcomeScreen
import com.ort.prueba.aplicacion.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),containerColor = Color.White) { innerPadding ->
//                    WelcomeScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    RegisterScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
//                    LoginScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}