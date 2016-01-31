package com.goit.syrotskiy.module7.consoleCalculator;

/*This console calculator executes simple math operations in standard and engineering mode (the complete list of available
operations will be specified in a particular mode).
This calculator can execute operations in parenthesis (when entering data, just input a brace before a number) and save
intermediate results in memory.
Special condition: for correct running, each operation must be surrounded by parenthesis.
 */

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        try {

            double result = CalculatorRunner.selectMode();
            System.out.println("result = " + result);

        } catch (DivisionByZeroCalculatorException ex) {
            System.out.println("[ERROR]: Division by zero!");
        } catch (ZeroExponentCalculatorException exc) {
            System.out.println("[ERROR]: The root of zero rate is impossible!");
        }
    }
}
