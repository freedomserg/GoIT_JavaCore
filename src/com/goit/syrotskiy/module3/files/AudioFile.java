package com.goit.syrotskiy.module3.files;


public class AudioFile extends File {

    public AudioFile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return AudioFile.class.getSimpleName() + "\t" + getName();
    }
}
