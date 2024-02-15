/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;

/**
 *
 * @author Adibah
 */
public class vehicle {
    private double speed;
    private double mileage;

    //Constructor
    public vehicle(double speed, double mileage) {
        this.speed=speed;
        this.mileage=mileage;
    }

    // getter
    public double getSpeed() {
        return speed;
    }

    public double getMileage() {
        return mileage;
    }
    
        public static void main(String[] args) {
        vehicle testVehicle=new vehicle(50.0, 25.0);

        System.out.println("Vehicle Speed: " + testVehicle.getSpeed());
        System.out.println("Vehicle Mileage: " + testVehicle.getMileage());
    }
}

