package Donggoi.Test;

import Donggoi.Lesson1.Point;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("X: "+x);
        double y=scanner.nextDouble();
        System.out.println("Y: "+y);
        scanner.nextLine();
        Point point=new Point(x,y);
        Point point1=new Point(16,22);
        System.out.println(point.distance(point1));
        System.out.println(point.distance(2,4));


    }
}
