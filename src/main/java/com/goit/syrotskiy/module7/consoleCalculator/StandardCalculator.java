package com.goit.syrotskiy.module7.consoleCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StandardCalculator {
    private double memory = 0;
    protected static List<String> listOfStandardOperations = new ArrayList<>();

    static{
        listOfStandardOperations.add(StandardOperations.ADDITION);
        listOfStandardOperations.add(StandardOperations.SUBTRACTING);
        listOfStandardOperations.add(StandardOperations.MULTIPLICATION);
        listOfStandardOperations.add(StandardOperations.DIVISION);
        listOfStandardOperations.add(StandardOperations.SQUARING);
        listOfStandardOperations.add(StandardOperations.CUBING);
        listOfStandardOperations.add(StandardOperations.SQUARE_ROOT);
        listOfStandardOperations.add(StandardOperations.CUBE_ROOT);
    }

    private void setMemory(double memory) {
        this.memory = memory;
    }

    private double getMemory() {
        return memory;
    }

    public double runCalculator() throws IOException {
        BufferedReader choiceReader = new BufferedReader(new InputStreamReader(System.in));
        double finalRes = 0;
        boolean proceed = true;
        double intermediateRes = receiveData();
        while(proceed) {
            boolean incorrectChoice = true;

            while(incorrectChoice) {
                System.out.print("proceed calculations with received result?(y/n): ");
                String choice = choiceReader.readLine();
                switch (choice) {
                    case "y":
                        setMemory(intermediateRes);
                        System.out.println("The intermediate result was saved in memory!");
                        intermediateRes = receiveData();
                        incorrectChoice = false;
                        break;
                    case "n":
                        finalRes = intermediateRes;
                        incorrectChoice = false;
                        proceed = false;
                        break;
                    default:
                        System.out.println("[ERROR]: incorrect choice " + "<" + choice + ">! Try again!");
                }
            }
        }
        return finalRes;
    }


    private double receiveData() throws IOException {
        System.out.println("m - retrieve from memory, current value in memory: " + getMemory());
        System.out.print("number = ");
        double operand1 = inputData();
        System.out.print("operation: ");
        String operation = chooseOperation();

        if (searchOperationWithOneOperand(operation)) {
            checkInputData(operation, operand1);
            return doOperation(operation, operand1);
        }
        System.out.println("m - retrieve from memory, current value in memory: " + getMemory());
        System.out.print("number = ");
        double operand2 = inputData();

        checkInputData(operation, operand1, operand2);
        return doOperation(operation, operand1, operand2);
    }


    protected void checkInputData(String operation, double... operands) {
        if (operation.equals(StandardOperations.DIVISION) && operands[1] == 0) {
            throw new DivisionByZeroCalculatorException();
        }
    }


    protected boolean searchOperationWithOneOperand(String operation) {
        return (operation.equals(StandardOperations.SQUARING) ||
                operation.equals(StandardOperations.CUBING) ||
                operation.equals(StandardOperations.SQUARE_ROOT) ||
                operation.equals(StandardOperations.CUBE_ROOT));
    }


    private double inputData() throws IOException {
        BufferedReader dataReader = new BufferedReader(new InputStreamReader(System.in));
        double number = 0;
        boolean incorrectData = true;

        while(incorrectData) {
            try {
                String inpStr = dataReader.readLine();

                switch (inpStr) {
                    case "(":
                        System.out.println();
                        number = receiveData();
                        System.out.println(")");
                        System.out.println();
                        incorrectData = false;
                        break;
                    case "m":
                        number = getMemory();
                        incorrectData = false;
                        break;
                    default:
                        number = Double.parseDouble(inpStr);
                        incorrectData = false;
                }
            } catch (NumberFormatException ex) {
                System.out.println("[ERROR]: you should enter a floating-point number! try again!");
                System.out.print("number = ");
            }
        }
        return number;
    }


    private String chooseOperation() throws IOException {
        BufferedReader operationReader = new BufferedReader(new InputStreamReader(System.in));
        String operation = "";

        boolean incorrectChoice = true;
        while(incorrectChoice) {
            String input = operationReader.readLine();
            if (checkOperation(input)) {
                operation = input;
                incorrectChoice = false;
            } else {
                System.out.println("[ERROR]: incorrect operation! Try again!");
                System.out.print("operation: ");
            }
        }
        return operation;
    }

    protected boolean checkOperation(String operation) {
        return listOfStandardOperations.contains(operation);
    }

    protected double doOperation(String operation, double... operands) {
        double result = 0;

        switch(operation) {
            case StandardOperations.ADDITION:
                result = executeAddition(operands[0], operands[1]);
                break;
            case StandardOperations.SUBTRACTING:
                result = executeSubtraction(operands[0], operands[1]);
                break;
            case StandardOperations.MULTIPLICATION:
                result = executeMultiplication(operands[0], operands[1]);
                break;
            case StandardOperations.DIVISION:
                result = executeDivision(operands[0], operands[1]);
                break;
            case StandardOperations.SQUARING:
                result = executeSquaring(operands[0]);
                break;
            case StandardOperations.CUBING:
                result = executeCubing(operands[0]);
                break;
            case StandardOperations.SQUARE_ROOT:
                result = executeSquareRoot(operands[0]);
                break;
            case StandardOperations.CUBE_ROOT:
                result = executeCubeRoot(operands[0]);
                break;
        }
        return result;
    }

    private double executeCubeRoot(double operand) {
        return Math.cbrt(operand);
    }

    private double executeSquareRoot(double operand) {
        return Math.sqrt(operand);
    }

    private double executeCubing(double operand) {
        return operand * operand * operand;
    }

    private double executeSquaring(double operand) {
        return operand * operand;
    }

    private double executeDivision(double operand1, double operand2) {
        return operand1 / operand2;
    }

    private double executeMultiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }

    private double executeSubtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }

    private double executeAddition(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
