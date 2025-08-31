package com.ort.prueba.aplicacion.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegisterScreen(modifier: Modifier){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            "Create Account",
            modifier = Modifier)
        Text(
            "Create an account so you can explore all the existing jobs",
            modifier = Modifier
        )
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Email") })
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Password") })
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Confirm Password") })
        Spacer(Modifier.height(16.dp))
        Button(onClick = { /* TODO: lógica de registro */ }) { Text("Registrar")}
        Spacer(Modifier.height(16.dp))
        Button(onClick = { /* TODO: lógica de registro */ }) { Text("Create an account")}
    }
}