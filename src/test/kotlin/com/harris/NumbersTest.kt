package com.harris

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.util.*

class NumbersTest {
    private fun Array<IntArray>.stringify(): String =
        "[\n" + Array(this.size,{ "  [ " + this[it].map { n -> n.toString() }
            .joinToString(", ") + " ]" })
            .joinToString("\n") + "\n]"

    @Test
    fun `Multiplication Table Test`() {
        val size = 3
        val user = multiplicationTable(size)

        val sol = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(2,4,6),
            intArrayOf(3,6,9)
        )

        assertTrue(user.contentDeepEquals(sol), "Expected:\n${sol.stringify()}\nGot:\n${user.stringify()}")
    }

    @Test
    fun `Prime Gap Test`() {
        assertEquals("[101, 103]", Arrays.toString(gap(2, 100, 110)))
        assertEquals("[103, 107]", Arrays.toString(gap(4, 100, 110)))
        assertEquals("[]", Arrays.toString(gap(6, 100, 110)))
    }
}