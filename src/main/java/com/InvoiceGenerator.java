package com;


public class InvoiceGenerator {
    private static final double COST_PER_KM = 10.0;
    private static final int COST_PER_TIME = 1;
    private static final int MINIMUM_FARE = 5;


    public double calculateFare(double distance, double time) {
        double calculate_Fare = (distance * COST_PER_KM) + (time * COST_PER_TIME);
        if (calculate_Fare < MINIMUM_FARE) {
            return MINIMUM_FARE;
        } else
            return calculate_Fare;
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }
}
