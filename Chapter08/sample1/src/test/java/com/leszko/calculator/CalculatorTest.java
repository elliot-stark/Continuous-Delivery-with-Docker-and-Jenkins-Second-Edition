package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Tests each field in calculator
 */

public class CalculatorTest {
     private Calculator calculator = new Calculator();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }

     @Test
     public void testDifference() {
          assertEquals(1, calculator.difference(3, 2));
     }

     @Test
     public void testDifference2() {
          assertEquals(3, calculator.difference(8, 5));
     }

     @Test
     public void testProduct() {
          assertEquals(6, calculator.product(2, 3));
     }

     @Test
     public void testProduct2() {
          assertEquals(12, calculator.product(4, 3));
     }

     @Test
     public void testQuotient() {
          assertEquals(2, calculator.quotient(4, 2));
     }

     @Test
     public void testQuotient2() {
          assertEquals(3, calculator.quotient(6, 2));
     }
}

