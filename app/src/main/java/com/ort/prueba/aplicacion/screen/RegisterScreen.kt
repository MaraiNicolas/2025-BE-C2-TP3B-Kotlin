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
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ort.prueba.aplicacion.R
import com.ort.prueba.aplicacion.components.AppCampoTexto
import com.ort.prueba.aplicacion.components.AppCampoTextoTitulo
import com.ort.prueba.aplicacion.components.AppLabelTexto
import com.ort.prueba.aplicacion.components.SignUpButton
import com.ort.prueba.aplicacion.components.SocialButton

@Composable
fun RegisterScreen(modifier: Modifier, navController : NavHostController){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 80.dp, start = 24.dp, end = 24.dp, bottom = 30.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){
        Column(
            modifier = Modifier.padding(horizontal = 21.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            AppCampoTextoTitulo(
                stringResource(R.string.registerscr_label_title),
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1059CE),
                textAlign = TextAlign.Center,
                lineHeight = 55.sp
            )
            AppLabelTexto(
                stringResource(R.string.registerscr_label_subtitle),
                modifier = Modifier,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold
            )
        }
        Column(
                modifier = Modifier.padding(top = 24.dp, start = 24.dp, end = 24.dp, bottom = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ){
            AppCampoTexto(label = stringResource(R.string.scr_input_email_placeholder),Modifier.fillMaxWidth().height(50.dp))
            AppCampoTexto(label = stringResource(R.string.scr_input_password_placeholder),Modifier.fillMaxWidth().height(50.dp))
            AppCampoTexto(label = stringResource(R.string.scr_input_confirmpassword_placeholder),Modifier.fillMaxWidth().height(50.dp));
        }
        Column(
            modifier = Modifier.padding(top = 24.dp, start = 24.dp, end = 24.dp, bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ){
            SignUpButton(Modifier.fillMaxWidth()
                .padding(horizontal = 0.dp)
                .height(50.dp), label = stringResource(R.string.registerscr_btn_label),
                navController = navController
            );
            AppLabelTexto(stringResource(R.string.registerscr_already_label),
                modifier = Modifier,
                color= Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            AppLabelTexto(
                text = stringResource(R.string.scr_btn_continue),
                color = Color(0xFF1059CE),
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                SocialButton(
                    painter = painterResource(id = R.drawable.google_image),
                    contentDescription = "google"
                )
                Spacer(modifier = Modifier.width(20.dp))
                SocialButton(
                    painter = painterResource(id = R.drawable.facebook_image),
                    contentDescription = "facebook"
                )
                Spacer(modifier = Modifier.width(20.dp))
                SocialButton(
                    painter = painterResource(id = R.drawable.apple_image),
                    contentDescription = "apple"
                )
            }
        }
    }
}
