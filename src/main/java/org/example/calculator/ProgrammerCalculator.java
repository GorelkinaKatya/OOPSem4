package org.example.calculator;

import org.example.operation.Conversion;
import org.example.operation.Operation;

/*
* Liskov Substitution Principle
* */
public class ProgrammerCalculator extends Calculator{

    public void calculate(int c, Conversion conversion) {
        String binResult = conversion.calculate(c);
        System.out.println(binResult);
    }
}
