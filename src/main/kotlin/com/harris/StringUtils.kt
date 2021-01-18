package com.harris

import java.lang.StringBuilder

fun greet(name: String): String {
    return "Hello, %s how are you doing today?".format( name )
}

fun repeatStr(r: Int, str: String) : String {
    val sb = StringBuilder()
    repeat( r ) { sb.append( str ) }
    return sb.toString()
}