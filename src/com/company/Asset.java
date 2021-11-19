package com.company;

public class Asset {
    private String manufacturer, model;
    private double weight;

    public Asset(String manufacturer, String model, double weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Asset = {" +
                "Manufacturer: " + manufacturer + ", Model: " + model + ", Weight: " + weight +
                "KG}";
    }
}
