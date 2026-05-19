package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(8,calculator.add(5,3));
    }
    @Test
    void testSub(){
        Calculator calculator = new Calculator();
        assertEquals(6,calculator.sub(10,4));
    }
    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(12,calculator.multiply(6,2));
    }
    @Test
    void testDevise(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.devise(5,2));
    }
}
