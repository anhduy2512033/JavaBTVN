package Btap2;

public class Main {
    public static void main(String[] args) {
        Cart c = new Cart();
        c.setCustomer("Duy ");
        c.setCity("HN");

        c.addProduct("Product 1");
        c.addProduct("Product 2");
        c.addProduct("Product 3");

        c.Tinh();

        System.out.println("Customer: " + c.getCustomer());
        System.out.println("City: " + c.getCity());
        System.out.println("Products: " + c.getProductList());
        System.out.println("Grand Total: " + c.getGrandTotal());
    }
}
