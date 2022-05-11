package com.example;

public class CartSystem extends TheSystem{
	CartSystem() {
    }

    @Override
    public void display() {
        // Your code here
        Double subtotal = 0.0;
        Double preTaxTotal = 0.0;
        Double tax = 0.0;
        Double total = 0.0;
        
        System.out.println("Cart:");
        System.out.format("%-20s %-20s %-10s %-10s %-10s\n", "Name", "Description", "Price", "Quantity", "Sub Total");
      
        if (getItemCollection() != null) {
                for (Item item : getItemCollection().values()) {

                    subtotal = item.getQuantity() * item.getItemPrice();
                    System.out.format("%-20s %-20s %-10.2f %-10d %-10.2f\n", item.getItemName(), item.getItemDesc(), item.getItemPrice(), item.getQuantity(), subtotal);

                    preTaxTotal += subtotal;
                }

                System.out.format("%-20s %-20.2f\n", "Pre-tax Total", preTaxTotal);

                tax = preTaxTotal * 0.05;
                System.out.format("%-20s %-20.2f\n", "Tax", tax);

                total = preTaxTotal + tax;
                System.out.format("%-20s %-20.2f\n", "Total", total);
        }
    }

}
