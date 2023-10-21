package org.example.calculator;

import org.example.operation.Operation;
public class StandartCalculator extends Calculator{
    public void calculate(double a, double b, Operation operation) {
        double result = operation.calculate(a, b);
        System.out.println(result);
    }
}
