package io.jotech;

public class Sample {
    public int doSummation(int firstNumber,int secondNumber,int... otherNumbers){
        int sum = firstNumber+secondNumber;
        for (int number : otherNumbers){
            sum+=number;
        }
        return sum;
    }

    public double doDivide(double numerator, double denominator) {
        if (denominator==0)throw new ArithmeticException();
        return numerator/denominator;
    }
}
