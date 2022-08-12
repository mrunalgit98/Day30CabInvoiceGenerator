package com;
import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenUserIdAndRides_ShouldReturn_MultipleInvoiceSummary() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
UC5PremiumRides
        String userId = "subham@gmailcom.com";
        Ride[] rides = {new Ride(5, 1, CabInvoiceGenerator.RideMode.NORMAL), new Ride(1, 1, CabInvoiceGenerator.RideMode.PREMIUM)};

        String userId = "random123@gmail.com";
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)};
 master
        invoiceGenerator.addRides(userId, rides);
        InvoiceSummarry summary = invoiceGenerator.getInvoiceSummary(userId);
        InvoiceSummarry expectedInvoiceSummary = new InvoiceSummarry(71, 2);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }
 UC5PremiumRides

}

}
 master
