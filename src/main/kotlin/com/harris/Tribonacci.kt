package com.harris

fun tribonacci(signature: DoubleArray, n: Int): DoubleArray {
    val results = DoubleArray( n )
    for ( i in 0 until n ) {
        if ( i < signature.size ) {
            results[i] = signature[i]
        } else {
            results[i] = results[i - 3] + results[i - 2] + results[i - 1]
        }
    }
    return results
}