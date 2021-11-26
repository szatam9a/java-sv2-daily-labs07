package day05;

import java.time.LocalDate;

public class Product {
    private String name;
    private double price;
    private LocalDate dateOfPurchase;

    public Product(String name, double price, LocalDate dateOfPurchase) {
        this.name = name;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
