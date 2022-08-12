package com;


public class InvoiceSummarry {
    private double totalFare;
    private int numberOfRides;
    private double avgFare;

    public InvoiceSummarry(double totalFare, int length) {
        this.totalFare = totalFare;
        numberOfRides = length;
        avgFare = totalFare / numberOfRides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummarry that = (InvoiceSummarry) o;
        return Double.compare(that.totalFare, totalFare) == 0 && numberOfRides == that.numberOfRides && Double.compare(that.avgFare, avgFare) == 0;
    }

}