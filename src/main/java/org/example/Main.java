package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*1)расширить класс калькулятор на умножение
        2)расширить класс калькулятор на деление
        3)расширить класс калькулятор на бинарный перевод*/

        Calculator calculator = new Calculator();
        System.out.println("calculator.sum(new ArrayList<>(Arrays.asList(10, 5, 2))) = " + calculator.sum(new ArrayList<>(Arrays.asList(10, 5, 2))));
        System.out.println("calculator.div(new ArrayList<>(Arrays.asList(10, 5, 2))) = " + calculator.div(new ArrayList<>(Arrays.asList(10, 5, 2))));
        System.out.println("calculator.mult(new ArrayList<>(Arrays.asList(10, 5, 2))) = " + calculator.mult(new ArrayList<>(Arrays.asList(10, 5, 2))));
        System.out.println("calculator.bin(new ArrayList<>(Arrays.asList(10, 5, 2))) = " + calculator.bin(new ArrayList<>(Arrays.asList(10, 5, 2))));


    }
}