package com.goit.Mmodule3.flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();

    public Bouquet(Flower flower) {
        flowers.add(flower);
    }
}
