package Btap3;

import java.util.ArrayList;
import java.util.List;

public class Room {
    String name;
    String position;
    List<Person > people;
    public Room(String name, String position){
        this.name = name;
        this.position = position;
        this.people = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void Printf() {
        System.out.println("Name" + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("List:");
        for (Person person : people){
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Phone: " + person.getPhone());
            System.out.println("Address: " + person.getAddress());
        }
    }}
