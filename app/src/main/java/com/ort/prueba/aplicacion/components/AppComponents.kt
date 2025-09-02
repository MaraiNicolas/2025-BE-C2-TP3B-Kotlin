package com.ort.prueba.aplicacion.components

import android.R.attr.icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GppGood
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF001F54),  // Azul marino
            contentColor = Color.White
        ),
        modifier = modifier.fillMaxWidth()
    ) {
        Text(text)
    }
}

@Composable
fun AppCampoTexto(
    label: String,
    modifier: Modifier = Modifier
) {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(label, color = Color.Black) }
    )
}
@Composable
fun SocialButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SocialButton()
    }
}

@Composable
fun LoginRegisterButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Botón Login azul con texto blanco
        Button(
            onClick = { /* Acción login */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4C6BAF)), // azul
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .height(50.dp)
                .width(160.dp)
        ) {
            Text(
                text = "Login",
                color = Color.White
            )
        }

        // Botón Register blanco con texto negro
        Button(
            onClick = { /* Acción register */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier
                .height(50.dp)
                .width(160.dp)
        ) {
            Text(
                text = "Register",
                color = Color.Black
            )
        }
    }
}
@Composable
fun SocialButton() {
    IconButton(onClick = { /* Acción */ }) {
        Icon(
            imageVector = Icons.Filled.GppGood,
            contentDescription = "Home",
            modifier = Modifier.size(32.dp),

        )
    }
}
@Composable
fun AppCampoTextoTitulo(
    label: String,
    modifier: Modifier = Modifier
){
    Text(text = label,
        color = Color(0xFF1565C0),
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold)
}

@Composable
fun AppLabelTexto(
    label: String,
    modifier: Modifier = Modifier
){
    Text(text=label,
        fontSize =17.sp,
        fontWeight = FontWeight.Bold,
        minLines = 2,
        softWrap = true,
        textAlign = TextAlign.Center,       // Centra el texto
        modifier = Modifier.fillMaxWidth()  )
}
