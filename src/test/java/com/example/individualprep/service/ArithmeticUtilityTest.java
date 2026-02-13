package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticUtilityTest {
    
    double delta = 1e-9;

    @Test
    void testPositiveExponent() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertEquals(8.0, ArithmeticUtil.exponent(2, 3), delta);
    }

    @Test
    void testNegativeBase() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertEquals(-8.0, ArithmeticUtil.exponent(-2, 3), delta);
        assertEquals(4.0, ArithmeticUtil.exponent(-2, 2), delta);
    }

    @Test
    void testZeroExponent() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertEquals(1.0, ArithmeticUtil.exponent(5, 0), delta);
    }

    @Test
    void testZeroBase() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertEquals(0.0, ArithmeticUtil.exponent(0, 5), delta);
    }

    @Test
    void testNegativeExponent() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertEquals(0.25, ArithmeticUtil.exponent(2, -2), delta);
    }

    @Test
    void testDivide() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertEquals(2.5, ArithmeticUtil.divide(5, 2), delta);
    }

    @Test
    void testDivideByZero() {
        ArithmeticUtility ArithmeticUtil = new ArithmeticUtility();
        assertThrows(IllegalArgumentException.class, () -> 
            ArithmeticUtil.divide(5, 0)
        );
    }
}
