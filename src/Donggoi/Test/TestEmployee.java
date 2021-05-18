package Donggoi.Test;

import Donggoi.Lesson1.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee(1,"Hoang","Hoang",900000000);
        System.out.println("Id: "+employee.getId());
        System.out.println("Firstname: "+employee.getFirstName());
        System.out.println("Lastname: "+employee.getLastName());
        System.out.println("FullName: "+employee.getFullname());
        System.out.println("Salary: "+employee.getSalary());
        Employee employee1=new Employee();
        System.out.println("Thong tin nhân viên: "+employee1.toString());
    }
}
