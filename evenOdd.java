/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;
import java.util.Scanner;
public class evenOdd {
    static String checkEvenOdd(int number) {
        //method to check even or odd from the number
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = obj.nextInt();

        String result = checkEvenOdd(inputNumber);

        // Displaying the result
        System.out.println(inputNumber + " is " + result);
    }
}
