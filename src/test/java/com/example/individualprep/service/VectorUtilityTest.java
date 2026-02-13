package com.example.individualprep.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class VectorUtilityTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddIfValid(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};
        double[] v2 = {6, 7, 8};

        double[] expected = new double[]{11, 13, 15};
        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAddIfNull(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = null;
        double[] v2 = {6, 7, 8};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.add(v1, v2)
        );
    }

    @Test
    void testAddIfDifferentSize(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7, 8};
        double[] v2 = {6, 7, 8};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.add(v1, v2)
        );
    }

    @Test
    void testSubtractIfValid(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7};
        double[] v2 = {6, 7, 8};

        double[] expected = new double[]{-1, -1, -1};
        double[] result = vectorUtility.subtract(v1, v2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSubtractIfNull(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = null;
        double[] v2 = {6, 7, 8};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.subtract(v1, v2)
        );
    }

    @Test
    void testSubtractIfDifferentSize(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {5, 6, 7, 8};
        double[] v2 = {6, 7, 8};

        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.subtract(v1, v2)
        );
    }

    @Test
    void testMultiplyIfValid() {
        VectorUtility vectorUtility = new VectorUtility();

        // Data testing sesuai logic Person C (Vector * Scalar)
        double[] v1 = {1.0, 2.0, 3.0};
        int scalar = 5;

        double[] expected = new double[]{5.0, 10.0, 15.0};
        double[] result = vectorUtility.multiply(v1, scalar);

        assertArrayEquals(expected, result, "Hasil perkalian vektor harus sesuai");
    }

    @Test
    void testMultiplyIfNull() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = null;
        int scalar = 5;

        // Memastikan ada proteksi jika input null
        assertThrows(IllegalArgumentException.class, () ->
                vectorUtility.multiply(v1, scalar)
        );
    }

    @Test
    void testMultiplyWithZero() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1 = {1.0, 2.0, 3.0};
        int scalar = 0;

        double[] expected = new double[]{0.0, 0.0, 0.0};
        double[] result = vectorUtility.multiply(v1, scalar);

        assertArrayEquals(expected, result, "Perkalian dengan nol harus menghasilkan vektor nol");
    }
}
