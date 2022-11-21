package ru.mmnigmatullov.pokedex.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.mmnigmatullov.pokedex.R


val OpenSans = FontFamily(
    Font(R.font.opensans_light, FontWeight.Light),
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_medium, FontWeight.Medium),
    Font(R.font.opensans_bold, FontWeight.Bold),
)

val OpenSansCondensed = FontFamily(
    Font(R.font.opensans_condensed_light, FontWeight.Light),
    Font(R.font.opensans_condensed_regular, FontWeight.Normal),
)

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)