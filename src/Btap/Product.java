package Btap;
public class Product {
    int id;
    String productName;
    int qty;
    float price;
    public Product(int id, String productName, int qty, float price){
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
    public boolean Check(){
        if(this.qty > 0){
            return true;
        } else {
            return false;
        }
    }
}
