package Donggoi.Test;

import Donggoi.Lesson1.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "Hoang", 23, "Ha noi", 10);
        System.out.println("Id: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Score: " + student.getScore());
        student.setScore(-7);
        System.out.println("Score: " + student.getScore());
        student.setScore(15);
        System.out.println("Score: " + student.getScore());

    }

}
