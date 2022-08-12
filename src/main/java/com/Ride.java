package com;

public class Ride {
    private double distance;
    CabInvoiceGenerator.RideMode rideMode;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    private double time;


    public Ride(double distance, double time, CabInvoiceGenerator.RideMode rideMode) {
        this.distance = distance;
        this.time = time;
        this.rideMode = rideMode;
    }


}