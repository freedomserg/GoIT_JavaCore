package com.goit.syrotskiy.module3.files;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {
    private List<File> directory = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public List<File> getDirectory() {
        return directory;
    }

    @Override
    public String toString() {
        return Directory.class.getSimpleName() + "\t" + getName() + "\t" + " contains files: " + getDirectory().size();
    }
}
