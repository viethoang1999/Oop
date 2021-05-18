package Donggoi.Test;

import Donggoi.Lesson1.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person student=new Person();
        Person student1=new Person(1,"Hoan1",21,"Hanoi");
        student.setId(1);
        student.setAddress("Hanoi");
        student.setAge(20);
        student.setName("Hoan");
        System.out.println("Id: "+student.getId());
        System.out.println("Address: "+student.getAddress());
        System.out.println("Age: "+student.getAge());
        System.out.println("Name: "+student.getName());
        System.out.println("-----------------------------");
        System.out.println("Id: "+student1.getId());
        System.out.println("Name: "+student1.getName());
        System.out.println("Age: "+student1.getAge());
        System.out.println("Address: "+student1.getAddress());
        student.toString();
        student1.toString();

    }
}
