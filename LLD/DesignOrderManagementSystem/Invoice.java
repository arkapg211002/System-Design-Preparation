package LowLevelDesign.DesignOrderManagementSystem;

public class Invoice {

    int totalItemPrice;
    int totalTax;
    int totalFinalPrice;

    //generate Invoice
    public void generateInvoice(Order order){

        //it will compute and update the above details
        totalItemPrice = 200;
        totalTax = 20;
        totalFinalPrice = 220;
    }
}
