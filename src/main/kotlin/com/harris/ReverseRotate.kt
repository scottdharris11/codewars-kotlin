package com.harris

import kotlin.math.pow;
import kotlin.math.roundToInt

fun revRot(nums:String, sz:Int): String {
    val sb = StringBuilder(nums.length)
    val workArr = CharArray(sz)
    var arrIdx = 0
    var wrkCube = 0
    nums.forEach {
        workArr[arrIdx] = it
        arrIdx++
        wrkCube += it.toString().toInt().toDouble().pow( 3 ).roundToInt()
        if ( arrIdx == sz ) {
            if ( wrkCube % 2 == 0 ) {
                for ( i in sz downTo 1 ) {
                    sb.append( workArr[i-1] )
                }
            } else {
                for ( i in 1 until sz ) {
                    sb.append( workArr[i] )
                }
                sb.append( workArr[0] )
            }
            arrIdx = 0
            wrkCube = 0
        }
    }
    return sb.toString()
}