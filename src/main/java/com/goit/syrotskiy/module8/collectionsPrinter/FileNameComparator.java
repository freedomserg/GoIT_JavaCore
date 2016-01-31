package com.goit.syrotskiy.module8.collectionsPrinter;

import com.goit.syrotskiy.module3.files.File;

import java.util.Comparator;

public class FileNameComparator implements Comparator<File> {
    @Override
    public int compare(File f1, File f2) {
        return f1.getName().compareToIgnoreCase(f2.getName());
    }
}
