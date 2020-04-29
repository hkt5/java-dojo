package com.silenceonthewire.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIsEvenTest {

    private final CheckIsEven checkIsEven = new CheckIsEven();

    @Test
    public void testZeroNumber() {

        assertTrue(this.checkIsEven.check(2));
    }

    @Test
    public void testEvenAndPositiveNumber() {

        assertTrue(this.checkIsEven.check(2));
    }

    @Test
    public void testEvenAndNegativeNumber() {

        assertTrue(this.checkIsEven.check(-2));
    }

    @Test
    public void testNotEvenAndPositiveNumber() {

        assertFalse(this.checkIsEven.check(1));
    }

    @Test
    public void testNotEvenAndNegativeNumber() {

        assertFalse(this.checkIsEven.check(-1));
    }
}