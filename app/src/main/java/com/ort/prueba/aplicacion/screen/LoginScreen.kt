package com.ort.prueba.aplicacion.screen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ort.prueba.aplicacion.components.AppButton
import com.ort.prueba.aplicacion.components.AppCampoTexto
import com.ort.prueba.aplicacion.components.AppCampoTextoTitulo
import com.ort.prueba.aplicacion.components.AppLabelTexto
import com.ort.prueba.aplicacion.components.LoginButton
import com.ort.prueba.aplicacion.components.SocialButton

@Composable
fun LoginScreen(modifier : Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(            modifier = Modifier.padding(start= 41.dp, end=41.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp)) {
            AppCampoTextoTitulo(
                text = "Login here",
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1059CE),
                textAlign = TextAlign.Center,
                lineHeight = 50.sp,
                modifier = Modifier
            )

            AppLabelTexto(
                text = "Welcome back you've been missed!",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            AppCampoTexto(label = "Email")

            AppCampoTexto(
                label = "Password"
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    "Forgot your password?",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Blue
                )
            }

            LoginButton(
                modifier,
                label = "Sign In"
            )
            SocialButton()
        }
    }
}