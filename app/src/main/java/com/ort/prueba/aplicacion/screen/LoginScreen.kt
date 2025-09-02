package com.ort.prueba.aplicacion.screen

import android.R
import android.graphics.Color.blue
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import com.ort.prueba.aplicacion.components.SocialButtons

@Composable
fun LoginScreen(modifier : Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp)
            .background(Color.White), // margen general
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        AppCampoTextoTitulo(
            label = "Login here"
        )
        Spacer(modifier = Modifier.height(8.dp))
        AppLabelTexto(
            label = "Welcome back, you've been missed"
        )

        Spacer(modifier = Modifier.height(32.dp))
        AppCampoTexto(label = "Email")

        Spacer(modifier = Modifier.height(16.dp))
        AppCampoTexto(
            label = "Password"
        )

        Spacer(modifier = Modifier.height(8.dp))
        // Texto alineado a la derecha
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            Text("Forgot your password?",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Blue)
        }
        Spacer(modifier = Modifier.height(24.dp))

        AppButton(
            text = "Sign In",
            onClick = { /* TODO: login logic */ }
        )

        AppLabelTexto(
            label = "Or continue with",
            modifier = Modifier.height(10.dp)
        )
        SocialButtons();
    }
}