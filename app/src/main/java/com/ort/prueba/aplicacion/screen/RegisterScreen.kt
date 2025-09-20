package com.ort.prueba.aplicacion.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ort.prueba.aplicacion.components.AppButton
import com.ort.prueba.aplicacion.components.AppCampoTexto
import com.ort.prueba.aplicacion.components.AppCampoTextoTitulo
import com.ort.prueba.aplicacion.components.AppLabelTexto
import com.ort.prueba.aplicacion.components.LoginButton
import com.ort.prueba.aplicacion.components.SignUpButton

@Composable
fun RegisterScreen(modifier: Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 80.dp, start = 24.dp, end = 24.dp, bottom = 24.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
            Column(
                modifier = Modifier.padding(horizontal = 41.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                AppCampoTextoTitulo(
                    "Create Account",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1059CE),
                    textAlign = TextAlign.Center,
                    lineHeight = 55.sp
                )
                AppLabelTexto(
                    "Create an account so you can explore all the existing jobs",
                    modifier = Modifier,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold
                )
                AppCampoTexto(label = "Email")
                AppCampoTexto(label = "Password")
                AppCampoTexto(label = "Confirm Password");
            }
            Column(
                    modifier = Modifier.padding(top = 80.dp, start = 24.dp, end = 24.dp, bottom = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ){
                SignUpButton(Modifier.fillMaxWidth()
                .padding(horizontal = 0.dp)
                .height(50.dp), label = "Sign Up");
            AppLabelTexto("Already have an account",
                modifier = Modifier,
                color= Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
                )

            AppLabelTexto(
                text = "Or continue with",
                modifier = Modifier.height(30.dp)
            )
        }
    }
}
