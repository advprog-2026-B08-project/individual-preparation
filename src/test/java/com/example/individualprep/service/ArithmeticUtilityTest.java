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

    @Test
    void testMultiply() {
        ArithmeticUtility arithmeticUtil = new ArithmeticUtility();
        assertEquals(25.0, arithmeticUtil.multiply(10.0, 2.5), delta);
    }

    @Test
    void testMultiplyWithNegative() {
        ArithmeticUtility arithmeticUtil = new ArithmeticUtility();
        assertEquals(-15.0, arithmeticUtil.multiply(5.0, -3.0), delta);
        assertEquals(20.0, arithmeticUtil.multiply(-4.0, -5.0), delta);
    }

    @Test
    void testMultiplyWithZero() {
        ArithmeticUtility arithmeticUtil = new ArithmeticUtility();
        assertEquals(0.0, arithmeticUtil.multiply(0.0, 10.0), delta);
        assertEquals(0.0, arithmeticUtil.multiply(5.5, 0.0), delta);
    }
}
