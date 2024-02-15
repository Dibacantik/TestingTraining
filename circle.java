/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;

public class circle {
    private double radius;
    private String color;

    // sonstructor
    public circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
    }

    // calculate area method
    public double calculateArea() {
        double area=3.14*radius*radius;
        return area;
    }
    
    //getter
    public double getRadius() {
        return radius;
    }
    //getter
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        circle testCircle = new circle(5.0, "Red");

        System.out.println("Radius: " + testCircle.getRadius());
        System.out.println("Color: " + testCircle.getColor());
        System.out.println("Area: " + testCircle.calculateArea());
    }
}

