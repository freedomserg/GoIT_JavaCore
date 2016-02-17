package com.goit.syrotskiy.module8.collectionsPrinter;

import com.goit.syrotskiy.module3.files.*;

import java.util.*;

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

        Collections.sort(files);
        CollectionsPrinter.printCollection(files);
    }
}
