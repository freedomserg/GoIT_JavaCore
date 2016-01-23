package com.goit.syrotskiy.luhnAlgorithm;

public class LuhnAlgorithmUtil {
    public static boolean validateData(int[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            if (i%2 != 0) continue;
            args[i] *= 2;
            if (args[i] > 9) {
                args[i] = args[i]%10 + args[i]/10;
            }
        }
        int sumOfDigits = 0;
        for (int digit : args) {
            sumOfDigits += digit;
        }
        return sumOfDigits%10 == 0;
    }
}