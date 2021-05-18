package Donggoi.Test;

import Donggoi.Lesson1.Rectange;

import java.util.Scanner;

public class TestRectange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        int weight = scanner.nextInt();
        System.out.print("CHiều rộng: ");
        int height = scanner.nextInt();
        Rectange rectange=new Rectange(10,10);
        System.out.println("length: "+rectange.getLength());
        System.out.println("width:" +   rectange.getWidth());
        System.out.println("Area: "+rectange.getArea());
        System.out.println("Perimeter: "+rectange.getPerimeter());
        System.out.println("---------------------------------------");
        rectange.setLength(5);
        rectange.setWidth(5);
        System.out.println("Area: "+rectange.getArea());
        System.out.println("Perimeter: "+rectange.getPerimeter());
        Rectange rectange1=new Rectange(weight,height);
        System.out.println("length: "+rectange1.getLength());
        System.out.println("width:" +   rectange1.getWidth());
        System.out.println("Area: "+rectange1.getArea());
        System.out.println("Perimeter: "+rectange1.getPerimeter());


    }
}
