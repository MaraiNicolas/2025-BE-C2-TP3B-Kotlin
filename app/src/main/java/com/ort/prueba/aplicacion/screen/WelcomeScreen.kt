package com.ort.prueba.aplicacion.screen
import androidx.compose.foundation.Image
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.ort.prueba.aplicacion.R
import com.ort.prueba.aplicacion.components.AppCampoTextoTitulo
import com.ort.prueba.aplicacion.components.AppLabelTexto
import com.ort.prueba.aplicacion.components.LoginButton
import com.ort.prueba.aplicacion.components.RegisterButton

@Composable
fun WelcomeScreen(modifier : Modifier, navController : NavHostController){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(modifier = Modifier.padding(horizontal = 22.dp,vertical = 16.dp),
            painter = painterResource(  id= R.drawable.welcome_image),
            contentDescription = "Welcome image",
        )
        Column(
            modifier = Modifier.padding(start= 41.dp, end=41.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ){
            AppCampoTextoTitulo(
                stringResource(id= R.string.welcome_label_title),
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1059CE),
                textAlign = TextAlign.Center,
                lineHeight = 50.sp
            )
            AppLabelTexto(text=stringResource(id= R.string.welcome_label_subtitle),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                fontSize = 10.sp)
        }
        Row(modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 60.dp),
            horizontalArrangement = Arrangement.Center){
            LoginButton(Modifier, label = stringResource(id= R.string.welcome_btn_login),navController = navController)
            Spacer(modifier = Modifier.width(10.dp))
            RegisterButton(Modifier, label = stringResource(id= R.string.welcome_btn_register), navController = navController)
        }

    }
}