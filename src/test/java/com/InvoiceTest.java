package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceTest {

    InvoiceGenerator invoiceGenerator;


    @Test
    public void givenDistanceAndMinute_shouldReturn_totalFare_forMultipleRides() {
        Ride [] ride = {
                new Ride(20.0, 15),
                new Ride(0.3, 2),
                new Ride(5.0, 3)
        };
        double fare = invoiceGenerator.calculateFare(ride);
        assertEquals(273, fare,  0.0);
    }

    @Test
    public void givenDistanceAndMinute_shouldReturntotalFare_forMultipleRides() {
        Ride [] ride = {
                new Ride(2.0, 15),
                new Ride(0.5, 1),
                new Ride(50.0, 30)
        };
        double fare = invoiceGenerator.calculateFare(ride);
        assertEquals(571, fare,  0.0);
    }



    @Test
    public void givenMultipleRides_shouldReturn_InvoiceSummary() {
        Ride [] ride = {
                new Ride(2.0, 14),
                new Ride(0.5, 1),
                new Ride(50.0, 30)
        };
        InvoiceSummary invoiceSummary = invoiceGenerator.calculateTotalFare(ride);
        InvoiceSummary expected = new InvoiceSummary(3, 570, 190);
        assertEquals(expected, invoiceSummary);
    }

}