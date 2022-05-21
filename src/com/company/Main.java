package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Circle circle = new Circle(2);
        Circle.circle();
        double radius = 7.5;
        double area = Math.PI*radius*radius;
        double circumference = 2*Math.PI*radius;
        System.out.println(area+" "+circumference);
    }
}
