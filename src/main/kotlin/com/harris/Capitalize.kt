package com.harris

fun capitalize(text: String): List<String> {
    return listOf( capitalize( text, true ), capitalize( text, false ) )
}

fun capitalize(text: String, oddUpper: Boolean): String {
    var upper = oddUpper
    val sb = StringBuilder( text.length )
    text.forEach {
        sb.append( if ( upper ) {
            upper = false
            it.toUpperCase()
        } else {
            upper = true
            it
        })
    }
    return sb.toString()
}