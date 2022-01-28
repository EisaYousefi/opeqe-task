package com.test.opeqetask.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

val OpeqeShapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(12.dp),
    large = RoundedCornerShape(20.dp)
)

val Shapes.opeqeSheet: Shape
    get() = RoundedCornerShape(
        topStart = 20.dp,
        topEnd = 20.dp,
        bottomEnd = 0.dp,
        bottomStart = 0.dp
    )
val Shapes.smallButton: Shape
    get() = RoundedCornerShape(8.dp)
val Shapes.fab: Shape
    get() = RoundedCornerShape(50)

