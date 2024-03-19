package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Vehicle luxuryCar = new LuxuryVehicle("Mercedes", "S-Class", "ABC123", true, true);

        RentalRecord rentalRecord = new RentalRecord(
                luxuryCar,
                new Date(2024, 2, 1),
                new Date(2024, 2, 5),
                "John Doe"
        );

        System.out.println("Total rental price: $" + rentalRecord.calculateTotalPrice());
    }
}