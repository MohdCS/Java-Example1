package com.company;

import java.util.ArrayList;

public class Container {
    private int number;
    private ArrayList<Asset> container;

    public Container(int number) {
        this.number = number;
        this.container = new ArrayList<Asset>();
    }

    public void addAsset(Asset asset){
        container.add(asset);
    }

    public void removeAsset(Asset asset){
        container.remove(asset);
    }

    @Override
    public String toString() {
        return "Container#" + number + ": " + container;
    }
}


