package com.harris

import kotlin.math.floor
import kotlin.math.roundToInt

fun litres(time: Double): Int {
    return floor( time * 0.5 ).roundToInt()
}