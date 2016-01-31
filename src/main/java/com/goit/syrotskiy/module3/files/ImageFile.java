package com.goit.syrotskiy.module3.files;


public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return ImageFile.class.getSimpleName() + "\t" + getName();
    }
}
