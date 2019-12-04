package io.jotech;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleTest {
    private Sample sample;

    @BeforeEach
    public void setup() {
        sample = new Sample();
    }

    @DisplayName("Test Sample.doSummation()")
    @Test
    void doSummationWithExactlyTwoNumbers() {

        assertEquals(5, sample.doSummation(1, 4)," 1+4 should be 5");
    }
    @DisplayName("Test Sample.doSummation(a,b,c...n)")
    @Test
    void doSummationWithMoreThanTwoNumbers() {
        assertEquals(10, sample.doSummation(1, 2,3,4),"1+2+3+4 should be 10");
    }
    @AfterEach
    public  void tearDown(){
        sample=null;
    }
}