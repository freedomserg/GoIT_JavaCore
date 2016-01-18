package com.goit.syrotskiy.module7.consoleCalculator;

import java.util.ArrayList;
import java.util.List;

public class EngineeringCalculator extends StandardCalculator {
    protected static List<String> listOfAdditionalOperations = new ArrayList<>();
    static{
        listOfAdditionalOperations.addAll(listOfStandardOperations);
        listOfAdditionalOperations.add(AdditionalOperations.SIN);
        listOfAdditionalOperations.add(AdditionalOperations.COS);
        listOfAdditionalOperations.add(AdditionalOperations.ROOT_OF_N_DEGREE);
        listOfAdditionalOperations.add(AdditionalOperations.EXPONENTIATION);
    }

    @Override
    protected void checkInputData(String operation, double... operands) {
        super.checkInputData(operation, operands);
    }

    @Override
    protected boolean searchOperationWithOneOperand(String operation) {
        return super.searchOperationWithOneOperand(operation);
    }

    @Override
    protected boolean checkOperation(String operation) {
        return super.checkOperation(operation);
    }

    @Override
    protected double doOperation(String operation, double... operands) {
        return super.doOperation(operation, operands);
    }
}
