package com.ort.prueba.aplicacion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.ort.prueba.aplicacion.R

@Composable
fun WelcomeScreen(modifier : Modifier){
    Column(
        modifier = Modifier.fillMaxSize(),
    ){
        Image(modifier = Modifier,
            painter = painterResource(  id= R.drawable.welcome_image),
            contentDescription = "Welcome",
        )
        Text(
            "Discover Your",
            modifier = Modifier,)
        Text(
            "Dream Job here",
            modifier = Modifier
        )
        Row(modifier = Modifier.fillMaxSize(),
            ){
            Button(onClick = { /* TODO: login logic */ }) {
                Text("Login")
            }
            Button(onClick = { /* TODO: login logic */ }) {
                Text("Register")
            }
        }

    }
}