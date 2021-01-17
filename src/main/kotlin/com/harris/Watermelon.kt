package com.harris

object Watermelon {
    fun divide(weight: Int): Boolean {
        return if ( weight % 2 == 0 ) {
            weight > 2
        } else {
            false
        }
    }
}