package org.example;

public class Customer {

    private String customerName;
    private double wallet;

    public Customer(String customerName, double wallet){
        this.customerName = customerName;
        this.wallet = 0;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void removeMoney(double amount){
        this.wallet -= Artwork.getPrice();
    }
    
}
