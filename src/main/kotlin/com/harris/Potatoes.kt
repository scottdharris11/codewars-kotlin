package com.harris

import kotlin.math.roundToInt
import kotlin.math.truncate

fun potatoes(p0:Int, w0:Int, p1:Int):Int {
    val waterWeight = w0 * ( p0 / 100.0 )
    val nonWaterWeight = w0 - waterWeight
    val nonWaterPct = 100 - p1
    val afterWeight = ( ( 100.0 / nonWaterPct ) * nonWaterWeight + 0.0001 )
    return truncate( afterWeight ).roundToInt()
}