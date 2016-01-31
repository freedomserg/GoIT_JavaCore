package com.goit.syrotskiy.module9.caesarAlgorithm;

import org.junit.Assert;
import org.junit.Test;

public class CaesarAlgorithmUtilTest {
    private String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()[]/?<>\'\"=-+*:;.,\t ";

    @Test(timeout = 100)
    public void calculateExpectedValueForEncode() throws Exception {
        int key = 500;
        String textForEncode = "<+++Java is the best+++>";
        StringBuilder encodedContent = new StringBuilder();
        for (int i = 0; i < textForEncode.length(); i++) {
            char symbol = textForEncode.charAt(i);
            int index = alphabet.indexOf(symbol);
            encodedContent.append(alphabet.charAt((index + key)%alphabet.length()));
        }
        String expected = encodedContent.toString();
        Assert.assertEquals(expected, CaesarAlgorithmUtil.encode(textForEncode, key));
    }

    @Test(timeout = 100)
    public void inputExpectedValueForEncode() throws Exception {
        int key = 3;
        String textForEncode = "<+++Java is the best+++>";
        String expected = "\";;;Mdydclvcwkhcehvw;;;=";
        Assert.assertEquals(expected, CaesarAlgorithmUtil.encode(textForEncode, key));
    }

    @Test(timeout = 100)
    public void calculateExpectedValueForDecode() throws Exception {
        int key = 500;
        String textForDencode = "\";;;Mdydclvcwkhcehvw;;;=";
        StringBuilder decodedContent = new StringBuilder();
        for (int i = 0; i < textForDencode.length(); i++) {
            char symbol = textForDencode.charAt(i);
            int index = alphabet.indexOf(symbol);
            decodedContent.append(alphabet.charAt((((index - key)%alphabet.length()) + alphabet.length())%alphabet.length()));
        }
        String expected = decodedContent.toString();
        Assert.assertEquals(expected, CaesarAlgorithmUtil.decode(textForDencode, key));
    }

    @Test(timeout = 100)
    public void inputExpectedValueForDecode() throws Exception {
        int key = 3;
        String textForDecode = "\";;;Mdydclvcwkhcehvw;;;=";
        String expected = "<+++Java is the best+++>";
        Assert.assertEquals(expected, CaesarAlgorithmUtil.decode(textForDecode, key));
    }
}