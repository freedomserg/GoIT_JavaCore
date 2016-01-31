package com.goit.syrotskiy.module9.caesarAlgorithm;

public class CaesarAlgorithmUtil {
    private static String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()[]/?<>\'\"=-+*:;.,\t ";

    public static String encode(String text, int key){
        StringBuilder encodedContent = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int index = alphabet.indexOf(symbol);
            encodedContent.append(alphabet.charAt((index + key)%alphabet.length()));
        }
        return encodedContent.toString();
    }

    public static String decode(String text, int key){
        StringBuilder decodedContent = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int index = alphabet.indexOf(symbol);
            decodedContent.append(alphabet.charAt((((index - key)%alphabet.length()) + alphabet.length())%alphabet.length()));
        }
        return decodedContent.toString();
    }
}
