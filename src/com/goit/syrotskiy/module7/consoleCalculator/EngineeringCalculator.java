package com.goit.syrotskiy.module7.consoleCalculator;

import java.util.ArrayList;
import java.util.List;

public class EngineeringCalculator extends StandardCalculator {
    protected static List<String> listOfExtendedOperations = new ArrayList<>();
    static{
        listOfExtendedOperations.addAll(listOfStandardOperations);
        listOfExtendedOperations.add(ExtendedOperations.SIN);
        listOfExtendedOperations.add(ExtendedOperations.COS);
        listOfExtendedOperations.add(ExtendedOperations.ROOT_OF_N_RATE);
        listOfExtendedOperations.add(ExtendedOperations.EXPONENTIATION);
    }

    @Override
    protected void checkInputData(String operation, double... operands) {
        super.checkInputData(operation, operands);
        if (operation.equals(ExtendedOperations.ROOT_OF_N_RATE) && (operands[1] == 0)) {
                throw new ZeroExponentCalculatorException();
        }
    }

    @Override
    protected boolean searchOperationWithOneOperand(String operation) {
        return (operation.equals(ExtendedOperations.SQUARING) ||
                operation.equals(ExtendedOperations.CUBING) ||
                operation.equals(ExtendedOperations.SQUARE_ROOT) ||
                operation.equals(ExtendedOperations.CUBE_ROOT) ||
                operation.equals(ExtendedOperations.SIN) ||
                operation.equals(ExtendedOperations.COS));
    }

    @Override
    protected boolean checkOperation(String operation) {
        return listOfExtendedOperations.contains(operation);
    }

    @Override
    protected double doOperation(String operation, double... operands) {
        if (listOfStandardOperations.contains(operation)) {
            return super.doOperation(operation, operands);
        }
        double result = 0;

        switch(operation) {
            case ExtendedOperations.SIN:
                result = executeSIN(operands[0]);
                break;
            case ExtendedOperations.COS:
                result = executeCOS(operands[0]);
                break;
            case ExtendedOperations.EXPONENTIATION:
                result = executeExponentiation(operands[0], operands[1]);
                break;
            case ExtendedOperations.ROOT_OF_N_RATE:
                result = executeRootOfNRate(operands[0], operands[1]);
                break;
        }
        return result;
    }

    private double executeRootOfNRate(double operand1, double operand2) {
        return Math.pow(operand1, 1.0 / operand2);
    }

    private double executeExponentiation(double operand1, double operand2) {
        return Math.pow(operand1, operand2);
    }

    private double executeCOS(double operand) {
        return Math.cos(Math.toRadians(operand));
    }

    private double executeSIN(double operand) {
        return Math.sin(Math.toRadians(operand));
    }
}
