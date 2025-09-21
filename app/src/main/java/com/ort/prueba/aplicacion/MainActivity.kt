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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ort.prueba.aplicacion.screen.LoginScreen
import com.ort.prueba.aplicacion.screen.RegisterScreen
import com.ort.prueba.aplicacion.screen.WelcomeScreen
import com.ort.prueba.aplicacion.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        setContent {
            val navController = rememberNavController();
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),containerColor = Color.White)
                {
                    innerPadding ->
                    NavHost(
                        navController = navController,
                        modifier = Modifier.padding( paddingValues = innerPadding),
                        startDestination = "Welcome"
                    ){
                        composable(route = "Welcome"){
                            WelcomeScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController
                            );
                        }
                        composable(route="Register"){
                            RegisterScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController
                            );
                        }
                        composable(route="Login"){
                            LoginScreen(
                                modifier = Modifier.padding(innerPadding),
                                navController
                            );
                        }
                    }
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