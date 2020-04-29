package com.silenceonthewire.logic;

import com.silenceonthewire.data.DecisionDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckValueTest {

    private final CheckValue checkValue = new CheckValue();
    private final DecisionDictionary decisionDictionary = new DecisionDictionary();

    @Test
    public void testEvenAndPositiveNumber() {

        assertEquals(this.decisionDictionary.isEvenAndPositive, this.checkValue.decision(2));
    }

    @Test
    public void testEvenAndNegativeNumber() {

        assertEquals(this.decisionDictionary.isEvenAndNegative, this.checkValue.decision(-2));
    }

    @Test
    public void testNotEvenAndPositiveNumber() {

        assertEquals(this.decisionDictionary.isNotEvenAndPositive, this.checkValue.decision(1));
    }

    @Test
    public void testNotEvenAndNegativeNumber() {

        assertEquals(this.decisionDictionary.isNotEvenAndNegative, this.checkValue.decision(-1));
    }
}