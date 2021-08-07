package com.javis.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyCalculationTest {
    @Mock
    MyCalculation myCalculation;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        myCalculation = new MyCalculation();
    }

    @Test
    void test_Sum() {
        assertEquals(7,myCalculation.sum(3,4));
    }

    @Test
    void test_subtract() {
        assertEquals(5,myCalculation.subtract(9,4));
    }

    @Test
    void test_multiple() {
        assertEquals("12",myCalculation.multiple("3","4"));
    }

    @Test
    void test_divide() {
        assertEquals("2",myCalculation.divide("8","4"));
    }
}