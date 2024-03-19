package org.example;

public class EconomicalVehicle extends Vehicle{
    private boolean hybrid;

    public EconomicalVehicle(String brand, String model, String licensePlate, boolean hybrib) {
        super(brand, model, licensePlate);
        this.hybrid = hybrib;
    }

    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    public double calculateRentalPrice(int rentalDays) {
        double basePrice = 50;
        if (hybrid) basePrice += 10;
        return basePrice * rentalDays;
    }
}
