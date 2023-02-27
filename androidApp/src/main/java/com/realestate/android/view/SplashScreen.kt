package com.realestate.android.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.realestate.android.R

/**
 * Author: Hari K
 * Date: 25/02/2023.
 */
@Composable
fun SplashScreen() {
    val opensansFamily = FontFamily(
        Font(R.font.opensans_light, FontWeight.Light),
        Font(R.font.opensans_regular, FontWeight.Normal),
        Font(R.font.opensans_medium, FontWeight.Medium),
        Font(R.font.opensans_bold, FontWeight.Bold)
    )

    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            MaterialTheme.colors.secondary,
                            MaterialTheme.colors.secondary,
                            Color.White,
                        )
                    ),
                    shape = RoundedCornerShape(0.dp),
                    alpha = 0.4F,
                )
        ) {


            Text(
                modifier = Modifier
                    .padding(top = 36.dp, start = 36.dp)
                    .align(alignment = Alignment.TopStart),
                text = "Find\nYour\nDream\nHome",
                fontSize = 75.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = opensansFamily
            )

            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
                    .align(alignment = Alignment.Center)
                    .padding(top = 120.dp),
                painter = painterResource(id = R.drawable.round_home_work),
                contentDescription = "",
                alpha = 0.1F
            )

            Button(modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(top = 24.dp)
                .clickable(interactionSource = MutableInteractionSource(),
                    indication = rememberRipple(
                        bounded = true, color = MaterialTheme.colors.primary
                    ),
                    onClick = {}), colors = ButtonDefaults.buttonColors(
                backgroundColor = MaterialTheme.colors.primaryVariant,
            ), shape = RoundedCornerShape(50), onClick = {}) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "Get Start",
                    fontSize = 20.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontFamily = opensansFamily
                )
            }


        }
    }
}
