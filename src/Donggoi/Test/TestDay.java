package Donggoi.Test;

import Donggoi.Lesson1.Dates;

import java.util.Scanner;

public class TestDay {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        int day=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap thang: ");
        int month=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap nam: ");
        int year=scanner.nextInt();
        scanner.nextLine();
        Dates date= new Dates(day,month,year);
        System.out.println("Day: "+date.getDay());
        System.out.println("Month: "+date.getMonth());
        System.out.println("Year: "+date.getYear());
        date.display();

//        Dates d = new Dates(1, 1, 1997);
//        d.display();
//        d.setDates(12, 12, 2004);
//        d.display();
//        d.setMonth(3);
//        d.display();

    }


}
