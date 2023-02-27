package com.realestate.android.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.realestate.android.R

/**
 * Author: Hari K
 * Date: 25/02/2023.
 */
@Composable
public fun font() {
    val opensansFamily = FontFamily(
        Font(R.font.opensans_light, FontWeight.Light),
        Font(R.font.opensans_regular, FontWeight.Normal),
        Font(R.font.opensans_medium, FontWeight.Medium),
        Font(R.font.opensans_bold, FontWeight.Bold)
    )
}