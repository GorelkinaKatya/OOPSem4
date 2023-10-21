package org.example.operation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Bin implements Conversion{
    @Override
    public String calculate(int a) {
        StringBuilder stringBuilder = new StringBuilder();
        while (a != 0 || stringBuilder.length() < 4) {
            stringBuilder.insert(0, a % 2);
            a = a / 2;
        }
        return stringBuilder.toString();
    }
}
