package com.goit.syrotskiy.module10.fileUsing;

import com.goit.syrotskiy.module9.caesarAlgorithm.CaesarAlgorithmUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        try {
            userInterface();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void userInterface() throws IOException {
        BufferedReader operationTypeReader = new BufferedReader(new InputStreamReader(System.in));
        byte chooseOperation = 0;
        while (true) {
            try {
                System.out.print("Please, choose an operation(1 - write to file, 2 - read from file): ");
                chooseOperation = Byte.parseByte(operationTypeReader.readLine());
                if (chooseOperation == 1 || chooseOperation == 2) break;
                else System.out.println("[ERROR]: your should choose 1 or 2! Try again!");
            } catch (NumberFormatException ex) {
                System.out.println("[ERROR]: your should choose digits 1 or 2! Try again!");
            }
        }
        String fileName = receiveFileName();

        switch(chooseOperation) {
            case 1:
                String content = receiveContent();
                int keyForEncoding = receiveKey();
                FileOperationsUtil.uploadToFile(CaesarAlgorithmUtil.encode(content, keyForEncoding), fileName);
                break;
            case 2:
                int keyForDecoding = receiveKey();
                String inputEncodedContent = FileOperationsUtil.readFile(fileName);
                String decodedContent = CaesarAlgorithmUtil.decode(inputEncodedContent, keyForDecoding);
                System.out.println("Scanned and decrypted text: " + decodedContent);
                break;
        }
    }

    private static int receiveKey() {
        int key = 0;
        while(true) {
            Scanner reader = new Scanner(System.in);
            try {
                System.out.print("Please, enter a key (positive integer number): ");
                key = reader.nextInt();
                if (key > 0) {
                    reader.close();
                    break;
                    } else
                    System.out.println("[ERROR]: your should enter a positive integer number! Try again!");
            } catch (InputMismatchException ex) {
                System.out.println("[ERROR]: your should enter a positive integer number! Try again!");
            }
        }
        return key;
    }

    private static String receiveContent() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please, enter your message for encoding and writing to the file: ");
        return reader.nextLine();
    }

    private static String receiveFileName() {
        String userDir = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        System.out.print("Please, enter the file's name in your project's root: ");
        Scanner reader = new Scanner(System.in);
        return userDir + fileSeparator + reader.nextLine();
    }
}
