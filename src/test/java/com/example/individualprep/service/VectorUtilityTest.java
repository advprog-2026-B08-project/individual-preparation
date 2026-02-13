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

        double[] v1 = {};
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

}
