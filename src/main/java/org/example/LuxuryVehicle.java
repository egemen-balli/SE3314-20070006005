package org.example;

public class LuxuryVehicle extends Vehicle{
    private boolean gps;
    private boolean leatherFabric;

    public LuxuryVehicle(String brand, String model, String licensePlate, boolean gps, boolean leatherFabric) {
        super(brand, model, licensePlate);
        this.gps = gps;
        this.leatherFabric = leatherFabric;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public void setLeatherFabric(boolean leatherFabric) {
        this.leatherFabric = leatherFabric;
    }

    public double calculateRentalPrice(int rentalDays) {
        double basePrice = 100;
        if (gps) basePrice += 20;
        if (leatherFabric) basePrice += 30;
        return basePrice * rentalDays;
    }
}
