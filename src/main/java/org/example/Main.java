package org.example;

import org.example.calculator.Calculator;
import org.example.calculator.ProgrammerCalculator;
import org.example.calculator.StandartCalculator;
import org.example.operation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Operation div = new Divide();
        Operation sum = new Sum();
        Operation mult = new Mult();
        Conversion bin = new Bin();

        System.out.println("Добро пожаловать в калькулятор. Выберите тип калькулятора: " +
                "\n1. Стандартный" +
                "\n2. Для программистов");

        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Введите число а: ");
            double a = scanner.nextDouble();
            System.out.println("Введите число b: ");
            double b = scanner.nextDouble();
            StandartCalculator calculator = new StandartCalculator();
            System.out.print("Сумма: ");
            calculator.calculate(a, b, sum);
            System.out.print("Умножение: ");
            calculator.calculate(a, b, mult);
            System.out.print("Деление: ");
            calculator.calculate(a, b, div);
        } else if (choice == 2 ) {
            System.out.println("Введите число: ");
            int c = scanner.nextInt();
            ProgrammerCalculator calculator = new ProgrammerCalculator();
            System.out.print("Результат перевода: ");
            calculator.calculate(c, bin);
        } else {
            System.out.println("Ошибка");
        }


    }
}