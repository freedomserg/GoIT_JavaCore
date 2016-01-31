package com.goit.syrotskiy.module7.consoleCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorRunner {
    public static double selectMode() throws IOException {
        BufferedReader choiceReader = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;

        boolean incorrectChoice = true;
        while (incorrectChoice) {
            System.out.print("Choose mode (s - standard(default), e - engineering): ");
            String choice = choiceReader.readLine();
            switch (choice) {
                case "s":
                    System.out.println("Accessable operations: " +
                            "addition <+> " +
                            "subtracting <-> " +
                            "multiplication <*> " +
                            "division </> " +
                            "squaring <x2> " +
                            "cubing <x3> " +
                            "square root <sroot> " +
                            "cube root <croot>");
                    result = new StandardCalculator().runCalculator();
                    incorrectChoice = false;
                    break;
                case "e":
                    System.out.println("Accessable operations: " +
                            "addition <+> " +
                            "subtracting <-> " +
                            "multiplication <*> " +
                            "division </> " +
                            "squaring <x2> " +
                            "cubing <x3> " +
                            "square root <sroot> " +
                            "cube root <croot> ");
                    System.out.println(
                            "sin <sin> " +
                                    "cos <cos> " +
                                    "root of n rate <nroot> " +
                                    "exponentiation <exp>");
                    result = new EngineeringCalculator().runCalculator();
                    incorrectChoice = false;
                    break;
                default:
                    System.out.println("Accessable operations: " +
                            "addition <+> " +
                            "subtracting <-> " +
                            "multiplication <*> " +
                            "division </> " +
                            "squaring <x2> " +
                            "cubing <x3> " +
                            "square root <sroot> " +
                            "cube root <croot>");
                    result = new StandardCalculator().runCalculator();
                    incorrectChoice = false;
            }
        }
        return result;
    }
}
