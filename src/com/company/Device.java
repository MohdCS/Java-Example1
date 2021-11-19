package com.company;

public class Device extends Asset {
    private String type;

    public Device(String manufacturer, String model, double weight, String type) {
        super(manufacturer, model, weight);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Device Type = {" + type + "}";
    }
}
