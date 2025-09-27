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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
fun LoginScreen(modifier : Modifier, navController : NavHostController) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 24.dp, end = 24.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Column(
            modifier = Modifier.padding(horizontal = 17.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp))
        {
            AppCampoTextoTitulo(
                text = stringResource(R.string.loginscr_label_title),
                fontSize = 35.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF1059CE),
                textAlign = TextAlign.Center,
                lineHeight = 50.sp,
                modifier = Modifier
            )

            AppLabelTexto(
                text = stringResource(R.string.loginscr_label_subtitle),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold,
                fontSize = 25.sp
            )

            AppCampoTexto(label = stringResource(R.string.scr_input_email_placeholder),
                modifier = Modifier.fillMaxWidth())

            AppCampoTexto(
                label = stringResource(R.string.scr_input_password_placeholder)
                ,
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    stringResource(R.string.loginscr_label_passforgot),
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Blue
                )
            }

            SignUpButton(
                modifier = Modifier.fillMaxWidth().height(50.dp),
                label = stringResource(R.string.loginscr_btn_signin),
                navController = navController
            )
            AppLabelTexto(stringResource(R.string.loginscr_label_newacc),
                modifier = Modifier,
                color= Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )


            AppLabelTexto(
                text = stringResource(R.string.scr_btn_continue),
                modifier = Modifier.height(30.dp),
                color = Color.Blue,
                fontWeight = FontWeight.SemiBold
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                SocialButton(
                    painter = painterResource(id = R.drawable.google_image),
                    contentDescription = "google",
                    Modifier.background(Color(0xFFF5F5F5))
                )
                Spacer(modifier = Modifier.width(16.dp))
                SocialButton(
                    painter = painterResource(id = R.drawable.facebook_image),
                    contentDescription = "facebook",
                    Modifier.background(Color(0xFFF5F5F5))
                )
                Spacer(modifier = Modifier.width(16.dp))
                SocialButton(
                    painter = painterResource(id = R.drawable.apple_image),
                    contentDescription = "apple",
                    Modifier.background(Color(0xFFF5F5F5))
                )
            }
        }
    }
}