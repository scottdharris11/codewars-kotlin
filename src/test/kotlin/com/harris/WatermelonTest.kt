package com.harris

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class WatermelonTest {
    @Test
    fun `testing basic cases`() {
        assertTrue( Watermelon.divide(4) )
        assertFalse( Watermelon.divide(2) )
        assertFalse( Watermelon.divide(5) )
        assertTrue( Watermelon.divide(88) )
        assertTrue( Watermelon.divide(100) )
        assertFalse( Watermelon.divide(67) )
        assertTrue( Watermelon.divide(90) )
        assertTrue( Watermelon.divide(10) )
        assertFalse( Watermelon.divide(99) )
        assertTrue( Watermelon.divide(32) )
    }
}