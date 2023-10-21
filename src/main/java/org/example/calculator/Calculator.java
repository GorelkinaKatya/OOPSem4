package org.example.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.operation.Operation;

/*
 * Single Responsibility Principle
 * */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculator {
    private String calculatorType;
}
