package com;


import java.util.Objects;

public class InvoiceSumarry {
    private double totalFare;
    private int numberOfRides;
    private double avgFare;

    public InvoiceSumarry(double totalFare, int length) {
        this.totalFare = totalFare;
        numberOfRides = length;
        avgFare = totalFare / numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSumarry that = (InvoiceSumarry) o;
        return Double.compare(that.totalFare, totalFare) == 0 && numberOfRides == that.numberOfRides && Double.compare(that.avgFare, avgFare) == 0;
    }

}