package com.goit.syrotskiy.module7.ronsoleCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorRunner {
    public static double selectMode() {
        BufferedReader choiceReader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;

        boolean incorrectChoice = true;
        while (incorrectChoice) {
            try {
                System.out.print("Choose mode (s - standard(default), e - engineering): ");
                String choice = choiceReader.readLine();
                switch (choice) {
                    case "s":
                        System.out.print("Accessable operations: ");
                        //specify operations
                        result = new StandardCalculator().runCalculator();
                        incorrectChoice = false;
                        break;
                    case "e":
                        System.out.print("Accessable operations: ");
                        //specify operations
                        //result = new EngineeringCalculator().runCalculator();
                        incorrectChoice = false;
                        break;
                    default:
                        result = new StandardCalculator().runCalculator();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                System.out.println("[ERROR]: data input error! Try again!");
            }
        }
        return result;
    }
}
