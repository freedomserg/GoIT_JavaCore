package com.goit.syrotskiy.module3.files;


public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return TextFile.class.getSimpleName() + "\t" + getName();
    }
}
