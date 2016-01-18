package com.goit.syrotskiy.module8.collectionsPrinter;

import com.goit.syrotskiy.module3.files.*;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Set<File> fSet = new TreeSet<>(new FileNameComparator());
        File aFile = new AudioFile("MySong");
        File iFile = new ImageFile("MyPicture");
        File tFile = new TextFile("MyText");

        Directory dFile = new Directory("MyDirectory");
        dFile.getDirectory().add(aFile);
        dFile.getDirectory().add(iFile);
        dFile.getDirectory().add(tFile);

        fSet.add(aFile);
        fSet.add(iFile);
        fSet.add(tFile);
        fSet.add(dFile);

        CollectionsPrinter.collectionsPrinter(fSet);
    }
}
