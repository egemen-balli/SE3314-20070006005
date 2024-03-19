package org.example;

abstract class Vehicle {
    private String brand;
    private String model;
    private String licensePlate;

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    abstract public double calculateRentalPrice(int rentalDays);
}
