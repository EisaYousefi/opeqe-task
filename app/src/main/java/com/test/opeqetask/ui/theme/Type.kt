package com.test.opeqetask.ui.theme


import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.test.opeqetask.R

val fontFamily = FontFamily(
    Font(R.font.dana_regular, FontWeight.Normal),
    Font(R.font.dana_light, FontWeight.Light),
    Font(R.font.dana_extra_light, FontWeight.ExtraLight),
    Font(R.font.dana_medium, FontWeight.Medium),
    Font(R.font.dana_bold, FontWeight.Bold)
)
val OpeqeTypography
    @Composable get() = Typography(
        defaultFontFamily = remember { fontFamily },
        h1 = h1TextStyle,
        h2 = h2TextStyle,
        h3 = h3TextStyle,
        h4 = h4TextStyle,
        h5 = h5TextStyle,
        subtitle1 = subtitleTextStyle,
        subtitle2 = subtitleSecondary,
        body1 = body1TextStyle,
        body2 = body2TextStyle,
        button = buttonTextStyle,
        overline = overlineTextStyle,
    )

val Typography.regularTitle: TextStyle
    @Composable get() =
        h3.copy(
            color = MaterialTheme.colors.title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        )
val Typography.jumboTitle: TextStyle
    @Composable get() =
        h3.copy(
            color = MaterialTheme.colors.subTitle,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
val Typography.mediumTitle: TextStyle
    @Composable get() =
        h3.copy(
            color = MaterialTheme.colors.title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
val Typography.boldTitle: TextStyle
    @Composable get() =
        h3.copy(
            color = MaterialTheme.colors.title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

val Typography.disabledRegularTitle: TextStyle
    @Composable get() =
        regularTitle.copy(
            color = MaterialTheme.colors.subtitle2,
        )
val Typography.disabledMediumTitle: TextStyle
    @Composable get() =
        mediumTitle.copy(
            color = MaterialTheme.colors.subtitle2,
        )

val Typography.disabledSubtitle: TextStyle
    @Composable get() =
        h3.copy(color = MaterialTheme.colors.disabledSubtitle, fontSize = 12.sp)

val h1TextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.title, 18.sp, FontWeight.Medium
    )
val h2TextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.title, 16.sp, FontWeight.Medium
    )
val h3TextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.title, 14.sp, FontWeight.Normal
    )
val h4TextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.title, 16.sp, FontWeight.Normal
    )
val h5TextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.title, 14.sp, FontWeight.Bold
    )
val overlineTextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.subTitle2, 10.sp, FontWeight.Normal
    )
val subtitleTextStyle: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.subTitle, 12.sp, FontWeight.Normal
    )
val subtitleSecondary: TextStyle
    @Composable get() = TextStyle(
        OpeqeTheme.colors.subtitle2, 12.sp, FontWeight.Normal
    )
val Typography.subtitleLarge: TextStyle
    @Composable get() = OpeqeTheme.typography.subtitle2.copy(
        fontSize = 14.sp, fontWeight = FontWeight.Normal
    )
val body1TextStyle: TextStyle
    @Composable get() = TextStyle(
        fontSize = 14.sp, fontWeight = FontWeight.Normal,
    )

val Typography.body1Colored: TextStyle
    @Composable get() = body1.copy(
        OpeqeTheme.colors.subTitle
    )
val buttonTextStyle: TextStyle
    @Composable get() = TextStyle(
        fontSize = 16.sp, fontWeight = FontWeight.Medium
    )
val body2TextStyle: TextStyle
    @Composable get() = TextStyle(
        fontSize = 12.sp, fontWeight = FontWeight.Normal
    )

val Typography.cardTitle: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.secondary, 16.sp, FontWeight.Bold
    )
val Typography.cardBody: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.subTitle, 16.sp, FontWeight.Medium
    )
val Typography.buttonBigTitle: TextStyle
    @Composable get() = h1.copy(
        OpeqeTheme.colors.title, 18.sp, FontWeight.Bold
    )

val Typography.bottomSheetTitle: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.subTitle, 16.sp, FontWeight.Medium
    )
val Typography.bottomSheetBodyLight: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.onBackgroundSecondaryDark, 12.sp, FontWeight.Normal
    )

val Typography.h1Bold: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.title, 16.sp, FontWeight.Bold
    )

val Typography.smallButtonTextStyle: TextStyle
    @Composable get() = body1Colored.copy(
        Color.Unspecified, 14.sp, FontWeight.Normal
    )

val Typography.textInputPlaceholder: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.subTitle, 14.sp, FontWeight.Normal
    )

val Typography.inputBody: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.subTitle, 14.sp, FontWeight.Medium
    )

val Typography.bodyActionable: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.primary, 14.sp, FontWeight.Medium
    )
val Typography.bodyActionableBold: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.primary, 14.sp, FontWeight.Bold
    )
val Typography.primaryTextButton: TextStyle
    @Composable get() = body1Colored.copy(
        OpeqeTheme.colors.primary, 12.sp, FontWeight.Medium
    )