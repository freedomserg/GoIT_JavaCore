package com.goit.syrotskiy.module7;

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
