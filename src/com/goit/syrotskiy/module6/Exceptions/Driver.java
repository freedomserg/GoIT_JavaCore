package com.goit.syrotskiy.module6.Exceptions;

public class Driver {
    private boolean fastened;

    public Driver() {
    }

    public Driver(boolean fastened) {
        this.fastened = fastened;
    }

    public boolean isFastened() {
        return fastened;
    }

    public void setFastened(boolean fastened) {
        this.fastened = fastened;
    }
}
