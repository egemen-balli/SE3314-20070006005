package org.example;

import java.util.Date;

class RentalRecord {
    private Vehicle vehicle;
    private Date rentalStartDate;
    private Date rentalEndDate;
    private String lessorIdentity;

    public RentalRecord(Vehicle vehicle, Date rentalStartDate, Date rentalEndDate, String lessorIdentity) {
        this.vehicle = vehicle;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.lessorIdentity = lessorIdentity;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getRentalStartDate() {
        return rentalStartDate;
    }

    public Date getRentalEndDate() {
        return rentalEndDate;
    }

    public String getLessorIdentity() {
        return lessorIdentity;
    }

    public double calculateTotalPrice() {
        long diffInMillies = Math.abs(rentalEndDate.getTime() - rentalStartDate.getTime());
        long rentalDays = diffInMillies / (24 * 60 * 60 * 1000);
        return vehicle.calculateRentalPrice((int) rentalDays);
    }
}
