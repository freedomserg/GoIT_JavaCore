package com.goit.syrotskiy.module8.collectionsPrinter;

import java.util.Set;

public class CollectionsPrinter {

    public static void printCollection(Set fSet) {
        System.out.println("TYPE\t\t" + "NAME\t\t" + "OTHER PROPERTIES");
        for (Object o : fSet) {
            System.out.println("==========================================");
            System.out.println(o.toString());
        }

    }
}
