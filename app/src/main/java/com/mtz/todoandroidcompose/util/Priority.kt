package com.mtz.todoandroidcompose.util

import androidx.compose.ui.graphics.Color


enum class Priority(val color: Color) {
    LOW(Color.Red),
    MEDIUM(Color.Yellow),
    HIGH(Color.Green),
    NONE(Color.Blue)
}