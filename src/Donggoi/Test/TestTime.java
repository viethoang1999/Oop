package Donggoi.Test;

import Donggoi.Lesson1.Time;

import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Time! ");
        int hour=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hour: "+hour);
        int minute=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Minute: "+minute);
        scanner.nextLine();
        int second=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Second: "+second);
        Time time=new Time(hour,minute,second);
        time.setTime(23,59,59);
        time.display();
        System.out.print("NextTime: ");
        time.nextSecond();
        time.display();
        System.out.print("previousSecond: ");
        time.previousSecond();
        time.display();
//        Time t = new Time(12, 1, 1);
//        t.display();
//        t.setTime(23, 59, 59);
//        t.display();
//        t.nextSecond();
//        t.display();
//        t.nextSecond();
//        t.display();
//        t.setTime(7, 0, 0);
//        t.display();
//        t.previousSecond();
//        t.display();



    }
}
