package jam101.week09;

import java.time.LocalDate;
import java.util.Collection;

public class Product {

    private String productName;
    private double productPrice;
    private LocalDate createDate;
    private int stockVolume;

    /*
    stok miktari random olarak belirlenir
     */
    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.createDate = LocalDate.now();
        this.stockVolume = getStockNumber();
    }

    public int getStockNumber() {
        return ((int) (Math.random() * (10-1)))+ 1;

    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getStockVolume() {
        return stockVolume;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setStockVolume(int stockVolume) {
        this.stockVolume = stockVolume;
    }


}
