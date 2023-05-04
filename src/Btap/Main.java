package Btap;

public class Main {
    public static void main(String[] args) {
        Product p = new Product(123,"ASDFF",3,134);
        boolean b = p.Check();
        System.out.println(b);
    }
}
