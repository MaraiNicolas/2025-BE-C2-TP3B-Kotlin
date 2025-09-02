package com.ort.prueba.aplicacion.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ort.prueba.aplicacion.components.AppButton
import com.ort.prueba.aplicacion.components.AppCampoTexto
import com.ort.prueba.aplicacion.components.AppCampoTextoTitulo
import com.ort.prueba.aplicacion.components.AppLabelTexto
import com.ort.prueba.aplicacion.components.SocialButton
import com.ort.prueba.aplicacion.components.SocialButtons

@Composable
fun RegisterScreen(modifier: Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
            .background(Color.White), // margen general
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        AppCampoTextoTitulo(
            "Create Account",
            modifier = Modifier)
        AppLabelTexto(
            "Create an account so you can explore all the existing jobs",
            modifier = Modifier
        )
        AppCampoTexto(label ="Email")
        Spacer(Modifier.height(16.dp))
        AppCampoTexto("Password")
        Spacer(Modifier.height(16.dp))
        AppCampoTexto("Confirm Password")
        Spacer(Modifier.height(16.dp))
        AppButton(text = "Sign Up",
            onClick = { /* TODO: login logic */ });
        Spacer(Modifier.height(16.dp))
        AppLabelTexto("Create an account")

        AppLabelTexto(
            label = "Or continue with",
            modifier = Modifier.height(10.dp)
        )
        SocialButtons();
    }
}