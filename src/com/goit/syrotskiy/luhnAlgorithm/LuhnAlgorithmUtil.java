package com.goit.syrotskiy.luhnAlgorithm;

public class LuhnAlgorithmUtil {
    public static final int LUHN_LIMIT = 9;

    public static boolean validateData(int[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            if (args.length % 2 == 0) {
                if (i % 2 != 0) continue;
                args[i] = modifyData(args[i]);
            } else {
                if (i % 2 == 0) continue;
                args[i] = modifyData(args[i]);
            }
        }
        int sumOfDigits = 0;
        for (int digit : args) {
            sumOfDigits += digit;
        }
        return sumOfDigits%10 == 0;
    }

    private static int modifyData(int digit) {
        digit *= 2;
        if (digit > LUHN_LIMIT) {
            digit = digit%10 + digit/10;
        }
        return digit;
    }
}