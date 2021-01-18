package com.harris

fun getCount(str : String) : Int {
    var vowelCnt = 0
    str.forEach {
        if ( it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
             it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U' ) {
            vowelCnt++
        }
    }
    return vowelCnt
}