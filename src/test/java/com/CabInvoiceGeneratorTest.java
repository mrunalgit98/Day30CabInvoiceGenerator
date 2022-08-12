package com;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenUserIdAndRides_ShouldReturn_MultipleInvoiceSummary() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        String userId = "subham@gmailcom.com";
        Ride[] rides = {new Ride(5, 1, CabInvoiceGenerator.RideMode.NORMAL), new Ride(1, 1, CabInvoiceGenerator.RideMode.PREMIUM)};
        invoiceGenerator.addRides(userId, rides);
        InvoiceSummarry summary = invoiceGenerator.getInvoiceSummary(userId);
        InvoiceSummarry expectedInvoiceSummary = new InvoiceSummarry(71, 2);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

}