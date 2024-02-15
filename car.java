/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;

/**
 *
 * @author Adibah
 */
public class car extends vehicle {
    private int numberOfDoors;

    //constructor for car
    public car(double speed, double mileage, int numberOfDoors) {
        super(speed, mileage);
        this.numberOfDoors = numberOfDoors;
    }

    //getter for car
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}