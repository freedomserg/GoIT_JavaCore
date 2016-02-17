package com.goit.syrotskiy.module3.files;

public abstract class File implements Comparable {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        File anotherFile = (File)o;
        return this.getName().compareToIgnoreCase(anotherFile.getName());
    }
}
