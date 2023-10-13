package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> list) {
        double result = 0;
        for (Number number : list) {
            result += number.doubleValue();
        }
        return result;
    }

    public double div(List<? extends Number> list) {
        double result = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            result /= list.get(i).doubleValue();
        }
        return result;
    }

    public double mult(List<? extends Number> list) {
        double result = 1;
        for (Number number : list) {
            result *= number.doubleValue();
        }
        return result;
    }

    public ArrayList<StringBuilder> bin(List<? extends Number> list) {
        ArrayList<StringBuilder> answer = new ArrayList<>();
        for (Number number : list) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = number.intValue();
            while (n != 0 || stringBuilder.length() < 4) {
                stringBuilder.insert(0, n % 2);
                n = n / 2;
            }
            answer.add(stringBuilder);
        }
        return answer;
    }

}

