package com.goit.syrotskiy.module9.caesarAlgorithm;

import com.goit.syrotskiy.module3.files.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        File aFile = new AudioFile("MySong");
        File iFile = new ImageFile("MyPicture");
        File tFile = new TextFile("MyText");

        Directory dFile = new Directory("MyDirectory");
        dFile.getDirectory().add(aFile);
        dFile.getDirectory().add(iFile);
        dFile.getDirectory().add(tFile);

        files.add(aFile);
        files.add(iFile);
        files.add(tFile);
        files.add(dFile);

        String collectionToStringView = files.toString().replace("[", "").replace("]", "");
        int key = receiveKey();
        String encodeContent = CaesarAlgorithmUtil.encode(collectionToStringView, key);
        String decodeContent = CaesarAlgorithmUtil.decode(encodeContent, key);

        System.out.println("Initial content: " + collectionToStringView + "\n"
                + "Encoded content: " + encodeContent + "\n"
                + "Decoded content: " + decodeContent);
    }

    private static int receiveKey() {
        Scanner reader = new Scanner(System.in);
        int key = 0;
        while(true) {
            System.out.print("Please, enter a key (positive integer number): ");
            key = reader.nextInt();
            if (key > 0) break;
        }
        return key;
    }
}
