package com.test.opeqetask.presentation.compose.theme


import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.test.opeqetask.R

val OpeqeLightColors: Colors
    @Composable
    get() = Colors(
        primary = colorResource(id = R.color.purple_400),
        primaryVariant = colorResource(id = R.color.purple_200),
        secondary = colorResource(R.color.black_600),
        secondaryVariant = colorResource(R.color.black),
        background = colorResource(R.color.white),
        surface = colorResource(R.color.purple_500),
        error = Color(0xffd32f2f),
        onPrimary = colorResource(R.color.purple_500),
        onSecondary = colorResource(R.color.purple_500),
        onBackground = Color(0, 0, 0),
        onSurface = Color(0, 0, 0),
        onError = colorResource(R.color.purple_500),
        isLight = true,
    )
val OpeqeDarkColors: Colors
    @Composable
    get() = OpeqeLightColors.copy(
        primary = colorResource(id = R.color.purple_500),
        primaryVariant = colorResource(id = R.color.purple_500),
        secondary = colorResource(R.color.purple_500),
        secondaryVariant = colorResource(R.color.purple_500),
        background = Color(0xFF121212),
        surface = Color(0xFF121212),
        error = Color(0xFFCF6679),
        onPrimary = Color.Black,
        onSecondary = colorResource(R.color.purple_500),
        onBackground = Color.White,
        onSurface = Color.White,
        onError = Color.White,
        isLight = false,
    )

val Colors.disabledSubtitle: Color get() = onBackground.copy(alpha = 0.7f)
val Colors.onBackgroundSecondaryDark: Color get() = Color(0xff9b9b9b)
val Colors.disabledBackground: Color get() = Color(0xfff0f0f0)
val Colors.subtitle2: Color get() = Color(0xff9b9b9b)
val Colors.disable: Color get() = Color(0xff9b9b9b)
val Colors.backgroundSecondary: Color get() = Color(0xfff7f7f7)
val Colors.title: Color get() = Color(0xff000000)
val Colors.subTitle: Color get() = Color(0xff4d4d4d)
val Colors.subTitle2: Color get() = Color(0xFFB9B9B9)
val Colors.separator: Color get() = Color(0xffdddddd)
val Colors.greyPlate: Color get() = Color(0xff979797)
val Colors.onButton: Color @Composable get() = colorResource(R.color.white)
val Colors.onBackgroundLight: Color get() = Color(0xFFECECEC)
val Colors.buttonDisable: Color get() = onBackgroundLight
val Colors.onButtonDisable: Color get() = subTitle2
val Colors.backdrop: Color get() = Color(0x33323b4b)
val Colors.information: Color get() = Color(0xff0067e4)
val Colors.informationLight: Color get() = Color(0x190067e4)
val Colors.success: Color get() = Color(0xff47bb82)
val Colors.onSuccess: Color @Composable get() = onButton
val Colors.inPrimaryColor: Color get() = Color(0xffffffff)
val Colors.toastBackground: Color get() = Color(0xff0065dc)
val Colors.errorBackground: Color get() = Color(0xfffde9ea)
val Colors.inputError: Color get() = Color(0xffe60722)
val Colors.indicatorBackground: Color get() = Color(0xffececec)
val Colors.infoCardBackground: Color get() = Color(0xfff8f8ff)
val Colors.infoErrorCardBackground: Color get() = Color(0x33ff6565)
val Colors.errorColor: Color get() = Color(0xffff6565)
val Colors.submitColor: Color get() = Color(0xff1caa64)
val Colors.declineColor: Color get() = Color(0xffd32f2f)

val Colors.border: Color get() = onBackground.copy(alpha = 0.1f)
val Colors.primaryDark: Color get() = Color(0xffd72415)
val Colors.tertiaryLight: Color get() = Color(0xffe5effb)
val Colors.primaryLite: Color get() = Color(0xffffe6de)
val Colors.inverse: Color get() = Color(0xffffffff)
val Colors.titleTextColor: Color get() = Color(0xff000000)
val Colors.accentActive: Color get() = Color(0xfffb884f)
val Colors.buttonTextPrimary: Color get() = Color(0xffffffff)
val Colors.textDisabledDarker: Color get() = Color(0x66000000)
val Colors.textDisabledLighter: Color get() = Color(0x669B9B9B)
val Colors.divider: Color get() = Color(0xfff2f2f2)
val Colors.mapHighlightColor: Color get() = Color(0x190065dc)
val Colors.mapHighlightBorderColor: Color get() = Color(0x800065dc)
val Colors.shimmer: Color get() = Color(0x34000000)
val Colors.onBackgroundSecondary: Color get() = Color(0xff333333)
val Colors.alertBackground: Color get() = Color(0xccfde9ea)
val Colors.backgroundSecondaryDark: Color get() = Color(0xfff0f0f0)
val Colors.textSmooth: Color get() = Color(0xffAFAFAF)
val Colors.invalid: Color get() = Color(0xff9b9b9b)
val Colors.titleSecondary: Color get() = Color(0xff545454)
val Colors.lightDisable: Color get() = Color(0xffdddddd)
val Colors.description: Color get() = Color(0xff666666)
val Colors.themeOutlineColor: Color get() = Color(0xff383838)
val Colors.themeCardColor: Color get() = Color(0xffffffff)
val Colors.themeTextColorDefault: Color get() = Color(0xff000000)
val Colors.themeTextColorNegative: Color get() = Color(0xffffffff)
val Colors.themeAccentColor: Color get() = Color(0xfffb884f)
val Colors.primary20: Color @Composable get() = OpeqeTheme.colors.primary
val Colors.textColorLight: Color @Composable get() = colorResource(R.color.white)
val Colors.confirmBackground: Color @Composable get() = Color(0xff1caa64)
val Colors.progressOrangeLight: Color @Composable get() = Color(0xffff8f00)
val Colors.titleGreenLight: Color @Composable get() = Color(0xff00baba)
val Colors.transparentBlack: Color @Composable get() = Color(0x40000000)
val Colors.darkGrey: Color @Composable get() = Color(0xff999999)