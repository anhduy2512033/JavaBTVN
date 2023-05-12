package btap5;

public class Main {
    public static void main(String[] args) {
        News n = new News();
        n.setTitle("Bai tap!");
        n.setPublishDate("2023-5-11");
        n.setAuthor("Anh Duy");
        n.setID(25122003);
        n.setContent("Example");
        n.InputRate(5);
        n.InputRate(6);
        n.Display();
    }
}
