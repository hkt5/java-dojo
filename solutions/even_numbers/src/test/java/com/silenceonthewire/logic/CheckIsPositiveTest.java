package com.silenceonthewire.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIsPositiveTest {

    private final CheckIsPositive checkIsPositive = new CheckIsPositive();

    @Test
    public void testZeroNumber() {

        assertTrue(this.checkIsPositive.check(0));
    }

    @Test
    public void testEvenAndPositiveNumber() {

        assertTrue(this.checkIsPositive.check(2));
    }

    @Test
    public void testEvenAndNegativeNumber() {

        assertFalse(this.checkIsPositive.check(-2));
    }

    @Test
    public void testNotEvenAndPositiveNumber() {

        assertTrue(this.checkIsPositive.check(1));
    }

    @Test
    public void testNotEvenAndNegativeNumber() {

        assertFalse(this.checkIsPositive.check(-1));
    }
}