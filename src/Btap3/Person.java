package Btap3;

public class Person {
    String name;
    int age;
    double phone;
    String address;
    public Person(String name, int age, double phone, String address){
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }
    public void add(Person person){
        person.add(person);
    }
    public void delete(Person person){
        person.delete(person);
    }

}
