package org.example.operation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class Mult implements Operation{
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
