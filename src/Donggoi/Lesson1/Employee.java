package Donggoi.Lesson1;

import java.util.Scanner;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Id: "+id);
        String firstname=scanner.nextLine();
        System.out.println("Fisrtname: "+firstname);
        String lastname=scanner.nextLine();
        System.out.println("Lastname: "+lastname);
        int salary=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Salary: "+salary);
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return firstName + lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
