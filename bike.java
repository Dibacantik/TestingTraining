/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;

/**
 *
 * @author Adibah
 */
public class bike extends vehicle {
    private boolean hasBasket;

    // constructor for bike
    public bike(double speed, double mileage, boolean hasBasket) {
        super(speed, mileage);
        this.hasBasket = hasBasket;
    }

    //getter for bike
    public boolean hasBasket() {
        return hasBasket;
    }
}