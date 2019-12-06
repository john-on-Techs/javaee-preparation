package io.jotech;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private Sample sample;

    @BeforeEach
    public void setup() {
        sample = new Sample();
    }

    @DisplayName("Test Sample.doSummation(1,4)")
    @Test
    void doSummationWithExactlyTwoNumbers() {

        assertEquals(5, sample.doSummation(1, 4), " 1+4 should be 5");
    }

    @DisplayName("Test Sample.doSummation(a,b,c...n)")
    @Test
    void doSummationWithMoreThanTwoNumbers() {
        assertEquals(10, sample.doSummation(1, 2, 3, 4), "1+2+3+4 should be 10");
    }

    //For catching exceptions
    @DisplayName("Test Sample.doDivide(3,0)")
    @Test
    public void doDivideByZero() {
        assertThrows(ArithmeticException.class, () -> sample.doDivide(3, 0), "Divide by Zero should throw an ArithmeticException");
    }

    @DisplayName("Test Sample.doDivide(9,3)")
    @Test
    public void doDivide() {
        boolean isServerUp = true;
        Assumptions.assumeTrue(isServerUp);
        assertEquals(3, sample.doDivide(9, 3), ()-> "9/3 Should be 3");
    }

    @DisplayName("Test Sample.doDivide(9,3) disable but enabled on linux")
    @Disabled
    @EnabledOnOs(OS.LINUX)
    @Test
    public void doDivideDisabled() {
        assertEquals(3, sample.doDivide(9, 3), "9/3 Should be 3");
    }
    @DisplayName("Test Sample.doMultiply")
    @Test
    public void doMultiply(){
        assertAll(
                ()-> assertEquals(4,sample.doMultiply(2,2)),
                ()-> assertEquals(20,sample.doMultiply(2,2,5)),
                ()-> assertEquals(0,sample.doMultiply(-2,0,5))

        );

    }


    @AfterEach
    public void tearDown() {
        sample = null;
    }
}