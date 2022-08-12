package com;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {

   

    @Test
    public void invoiceGenerator_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoice = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5), new Ride(0.1, 1)};
        double totalFare = invoice.calculateFare(rides);
        InvoiceSummary actualInvoiceSumarry = new InvoiceSummary(totalFare, rides.length);
        InvoiceSummary expectedInvoiceSumarry = new InvoiceSummary(30.0, 2);
        Assert.assertEquals(expectedInvoiceSumarry,actualInvoiceSumarry);
    }

}
