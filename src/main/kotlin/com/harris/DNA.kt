package com.harris

fun makeComplement(dna : String) : String {
    val sb = StringBuilder( dna.length )
    dna.forEach {
        sb.append( when ( it ) {
            'A' -> 'T'
            'T' -> 'A'
            'C' -> 'G'
            'G' -> 'C'
            else -> it
        })
    }
    return sb.toString()
}