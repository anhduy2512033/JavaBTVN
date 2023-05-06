package Btap3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nam", 23, 123456789, "Ha Noi");
        Person p2 = new Person("Duy", 24, 987654321, "Bac Ninh");
        Room room = new Room("Classroom", "1");
        room.getPeople().add(p1);
        room.getPeople().add(p2);
        room.Printf();
        room.getPeople().remove(p2);
        room.Printf();
    }
}
