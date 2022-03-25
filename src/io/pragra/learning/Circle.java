package io.pragra.learning;

public class Circle {

    private static double PI;

    static {
        PI=3.14;
        System.out.println("static block called");
    }

    private double radius;

    public Circle(double PI){

    }
}
