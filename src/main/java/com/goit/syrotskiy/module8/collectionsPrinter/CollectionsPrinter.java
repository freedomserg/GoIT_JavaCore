package com.goit.syrotskiy.module8.collectionsPrinter;

import com.goit.syrotskiy.module3.files.File;

import java.util.Collection;

public class CollectionsPrinter {

    public static void printCollection(Collection<File> files) {
        System.out.println("TYPE\t\t" + "NAME\t\t" + "OTHER PROPERTIES");
        for (File file : files) {
            System.out.println("==========================================");
            System.out.println(file.toString());
        }

    }
}
