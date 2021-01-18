package com.harris

import kotlin.math.sqrt

fun multiplicationTable(size: Int) = Array( size ) {
        i -> IntArray( size ) { j -> (i + 1) * (j + 1) }
}

fun gap(g:Int, m:Long, n:Long):LongArray {
    for ( i in m until n ) {
        if ( isPrime( i ) && ( i + g <= n ) && isPrime( i + g ) ) {
            var consecutive = true
            for ( j in i+1 until i+g-1 ) {
                if ( isPrime( j ) ) {
                    consecutive = false
                    break
                }
            }
            if ( consecutive ) {
                return longArrayOf(i, i + g)
            }
        }
    }
    return longArrayOf()
}

fun isPrime(num: Long): Boolean {
    if (num <= 1) {
        return false
    }
    val max = sqrt(num.toDouble()).toInt()
    for ( i in max downTo 2 ) {
        if ( num % i == 0L ) {
            return false
        }
    }
    return true
}