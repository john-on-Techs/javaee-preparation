package io.jotech;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {
    private Sample sample;

    @BeforeEach
    public void setup() {
        sample = new Sample();
    }

    @DisplayName("Test Sample.doSummation(1,4)")
    @Test
    void doSummationWithExactlyTwoNumbers() {

        assertEquals(5, sample.doSummation(1, 4)," 1+4 should be 5");
    }
    @DisplayName("Test Sample.doSummation(a,b,c...n)")
    @Test
    void doSummationWithMoreThanTwoNumbers() {
        assertEquals(10, sample.doSummation(1, 2,3,4),"1+2+3+4 should be 10");
    }
    //For catching exceptions
    @DisplayName("Test Sample.doDivide(3,0)")
    @Test
    public  void doDivideByZero(){
        assertThrows(ArithmeticException.class,()->sample.doDivide(3,0), "Divide by Zero should throw an ArithmeticException");
    }
    @DisplayName("Test Sample.doDivide(9,3)")
    @Test
    public  void doDivide(){
        assertEquals(3,sample.doDivide(9,3),"9/3 Should be 3");
    }
    @DisplayName("Test Sample.doDivide(3,0)")
    @Test
    public  void doDivideWithDifferentExpectedException(){
        assertThrows(NullPointerException.class,()->sample.doDivide(3,0), "Divide by Zero should throw an ArithmeticException");
    }


    @AfterEach
    public  void tearDown(){
        sample=null;
    }
}