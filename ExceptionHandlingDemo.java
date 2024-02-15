/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;
import java.util.Scanner;
public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator: ");
            int numerator = obj.nextInt();
            System.out.println("Enter the denominator: ");
            int denominator = obj.nextInt();

            int result = divideNumbers(numerator,denominator);

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }

    static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
