package com.company;

public class Vehicle extends Asset {
    private String type;

    public Vehicle(String manufacturer, String model, double weight, String type) {
        super(manufacturer, model, weight);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vehicle Type = {" + type + "}";
    }
}
