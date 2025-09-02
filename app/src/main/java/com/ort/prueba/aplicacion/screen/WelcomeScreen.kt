package com.ort.prueba.aplicacion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ort.prueba.aplicacion.R
import com.ort.prueba.aplicacion.components.AppCampoTexto
import com.ort.prueba.aplicacion.components.AppCampoTextoTitulo
import com.ort.prueba.aplicacion.components.AppLabelTexto
import com.ort.prueba.aplicacion.components.LoginRegisterButtons

@Composable
fun WelcomeScreen(modifier : Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
            .background(Color.White), // margen general
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(modifier = Modifier,
            painter = painterResource(  id= R.drawable.welcome_image),
            contentDescription = "Welcome",
        )
        AppCampoTextoTitulo(
            "Discover Your",
            modifier = Modifier)
        AppCampoTextoTitulo(
            "Dream Job here",
            modifier = Modifier
        )
        AppLabelTexto(label="Explore all the existing job roles based on your interest and study major")
        Spacer(Modifier.height(50.dp))
        LoginRegisterButtons()

    }
}