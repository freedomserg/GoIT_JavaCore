package com.goit.syrotskiy.luhnAlgorithm;

public class LuhnAlgorithm {
    public static boolean validateData(int... args) {
        for (int i = 0; i < args.length/2; i++) {
            int temp = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = temp;
        }
        for (int i = 0; i < args.length; i++) {
            if (i%2 == 0) continue;
            args[i] *= 2;
            if (args[i] > 9) {
                int temp1 = args[i]%10;
                int temp2 = args[i]/10;
                args[i] = temp1 + temp2;
            }
        }
        int sumOfDigits = 0;
        for (int digit : args) {
            sumOfDigits += digit;
        }
        return sumOfDigits%10 == 0;
    }
}