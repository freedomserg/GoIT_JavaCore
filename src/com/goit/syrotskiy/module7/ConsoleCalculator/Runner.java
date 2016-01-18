package com.goit.syrotskiy.module7.ConsoleCalculator;

import com.goit.syrotskiy.module7.ConsoleCalculator.CalculatorRunner;
import com.goit.syrotskiy.module7.ConsoleCalculator.DivisionByZeroCalculatorException;

public class Runner {
    public static void main(String[] args) {
        try {

            double result = CalculatorRunner.selectMode();
            System.out.println("result = " + result);

        } catch (DivisionByZeroCalculatorException ex) {
            System.out.println("[ERROR]: Division by zero!");
        }
    }
}
