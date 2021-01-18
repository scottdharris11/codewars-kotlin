package com.harris

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringUtilsTest {
    @Test fun `Basic tests for greet`() {
        assertEquals(greet("Ryan"), "Hello, Ryan how are you doing today?")
        assertEquals(greet("Shingles"), "Hello, Shingles how are you doing today?")
    }

    @Test fun `Repeat 4 a`() {
        assertEquals("aaaa", repeatStr(4, "a"))
    }

    @Test fun `Repeat 3 Hello`() {
        assertEquals("HelloHelloHello", repeatStr(3, "Hello"))
    }

    @Test fun `Repeat 5 Empty`() {
        assertEquals("", repeatStr(5, ""))
    }

    @Test fun `Repeat 0 Empty`() {
        assertEquals("", repeatStr(0, "kata"))
    }
}