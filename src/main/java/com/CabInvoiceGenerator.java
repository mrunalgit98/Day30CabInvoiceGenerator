package com;

public class CabInvoiceGenerator {
    private static double COST_PER_KM;
    private static  int COST_PER_TIME ;
    private static  int MINIMUM_FARE ;
    private RideRepository rideRepository;

    public enum RideMode {
        NORMAL(10,
                1,
                5),
        PREMIUM(15,
                2,
                20.0);

        private double COST_PER_KM;
        private int COST_PER_TIME;
        private double MINIMUM_FARE;

        RideMode(double MINIMUM_COST_PER_KM, int COST_PER_MIN, double MINIMUM_FARE) {
            this.COST_PER_KM = MINIMUM_COST_PER_KM;
            this.COST_PER_TIME = COST_PER_MIN;
            this.MINIMUM_FARE = MINIMUM_FARE;
        }
    }

    public double calculateFare(double distance, double time, double COST_PER_KM,int COST_PER_TIME,double MINIMUM_FARE ) {
        double calculate_Fare = distance * COST_PER_KM + time * COST_PER_TIME;
        if (calculate_Fare < MINIMUM_FARE) {
            return MINIMUM_FARE;
        } else
            return calculate_Fare;
    }

    public CabInvoiceGenerator() {
        this.rideRepository = new RideRepository();
    }

    public InvoiceSummarry calculateFare(Ride[] rides) {
        double totalFare =0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.getDistance(), ride.getTime(),ride.rideMode.COST_PER_KM,ride.rideMode.COST_PER_TIME,ride.rideMode.MINIMUM_FARE);
        }

        return new InvoiceSummarry(totalFare,rides.length);
    }


    public void addRides(String userId, Ride[] rides) {
        rideRepository.addRide(userId, rides);
    }

    public InvoiceSummarry getInvoiceSummary(String userId) {
        return this.calculateFare(rideRepository.getRides(userId));
    }



}