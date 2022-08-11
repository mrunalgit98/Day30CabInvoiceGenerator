package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class cabIncoice {

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        cabInvoice invoiceGenerator = new cabInvoice();
        double distance = 1.0;
        int time = 10;
        double fare = invoiceGenerator.calculateFare(distance, time);
        assertEquals(20, fare, 0.0);
    }

    @Test

    public void givenMultipleRidesShouldReturnTotalFare() {
        cabInvoice invoiceGenerator = new cabInvoice();

        Cab[] rides = { new Cab(2.0, 5), new Cab(0.1, 1) };
            double fare = invoiceGenerator.calculateFare(rides);
        assertEquals(30, fare, 0.0);
    }
}