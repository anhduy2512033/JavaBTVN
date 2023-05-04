package Btap2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    int id;
    String customer;
    double grandTotal;
    List<String> productList;
    String city;

    public Cart() {
        productList = new ArrayList<>();
    }

    public void addProduct(String product) {
        productList.add(product);
    }

    public void removeProduct(String product) {
        productList.remove(product);
    }
    public void Tinh() {
        double ship;
        if (city.equals("HN") || city.equals("HCM")) {
            ship = 0.01;
        } else {
            ship = 0.02;
        }
        grandTotal += grandTotal * ship;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }
}
