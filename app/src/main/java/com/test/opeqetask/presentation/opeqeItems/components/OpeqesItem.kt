package com.test.opeqetask.presentation.opeqeItems.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.glide.GlideImage
import com.test.opeqetask.presentation.compose.theme.*
import com.test.opeqetask.data.remote.dto.Result

@Composable
fun OpeqesItem(
    result: Result,
    onItemClick: () -> Unit={}
) {

    Box(
        modifier = Modifier
            .pagePaddings()
            .fillMaxSize()
            .clickable {
                onItemClick()
            }
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween ,
            verticalAlignment = Alignment.Bottom) {
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .weight(2f)

            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 20.sp,
                                color = OpeqeTheme.colors.confirmBackground
                            )
                        ) {
                            append("F")
                        }
                        append("ull")
                        withStyle(
                            style = SpanStyle(
                                fontSize = 20.sp,
                                color = OpeqeTheme.colors.confirmBackground
                            )
                        ) {
                            append("N")
                        }
                        append("ame")
                    },

                    color =OpeqeTheme.colors.title,
                    style = OpeqeTypography.h2
                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = result.name.first,
                    color =OpeqeTheme.colors.subTitle,
                    style = OpeqeTypography.h3
                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text =result.name.last,
                    color =OpeqeTheme.colors.subTitle,
                    style = OpeqeTypography.h3
                )
            }

            Column(
                modifier = Modifier
                    .wrapContentHeight(),
            ) {
                // data.priceLow
                Text(
                    text = buildAnnotatedString {

                        withStyle(
                            style = SpanStyle(
                                fontSize = 20.sp,
                                color = OpeqeTheme.colors.confirmBackground
                            )
                        ) {
                            append("L")
                        }
                        append("ocathin")
                    },
                    color =OpeqeTheme.colors.title,
                    style = OpeqeTypography.h2

                )
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text =result.location.country,
                    color =OpeqeTheme.colors.subTitle,
                    style = OpeqeTypography.h3
                )
                Text(
                    text =result.location.city,
                    color =OpeqeTheme.colors.subTitle,
                    style = OpeqeTypography.h3
                )
            }


            Column(
                modifier = Modifier
                    .wrapContentSize()
                    .padding( start =  20.dp, top = 20.dp , bottom = 20.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GlideImage(
                    modifier = Modifier
                        .clip(CircleShape)
                        .border(
                            width = 2.dp,
                            color = OpeqeTheme.colors.primary,
                            shape = CircleShape
                        )
                        .requiredHeight(50.dp)
                        .requiredWidth(50.dp),
                    imageModel = result.picture.thumbnail,
                    contentScale = ContentScale.Crop,
                    circularRevealedEnabled = true,
                )

            }
        }


    }
    Divider()

}