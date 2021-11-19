package com.company;

public class Main {

    public static void main(String[] args) {
        Container container = new Container(1);

        Asset vehicle = new Vehicle("VW", "Golf R Mk8", 1551.68, "hatchback");

        Asset device = new Device("Dell", "Latitude 5546", 1.54, "laptop");

        container.addAsset(vehicle);
        container.addAsset(device);
        System.out.println(container);

        container.removeAsset(vehicle);
        container.removeAsset(device);
        System.out.println(container);
    }
}
