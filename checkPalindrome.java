/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;
import java.util.Scanner;
public class checkPalindrome {
    static boolean palindromeChecker(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean result = palindromeChecker(inputString);

        if (result) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome.");
        }
    }
}

