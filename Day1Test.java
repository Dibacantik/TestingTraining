/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day1test;

/**
 *
 * @author Adibah
 */
import java.util.Scanner;
public class Day1Test {
        static void sumNumber(int num1, int num2){
        int sum;
        sum=num1+num2;
        System.out.println("Summation of num1+num 2 "+sum);
}
        public static void printNineTable() {
        System.out.println("Multiplication Table for 9:");

        for (int i = 1; i <= 10; i++) {
            int result = 9 * i;
            System.out.println("9 * " + i + " = " + result);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int num1=obj.nextInt();
        int num2=obj.nextInt();
        sumNumber(num1,num2);
        
        
        /*///////////////////
	int firstNum = obj.nextInt();
	int secondNum = obj.nextInt();
		
	System.out.println("Number 1: "+firstNum+"\nNumber 2: "+secondNum);

        // swapping 
        System.out.println("Swapping");
	firstNum = firstNum + secondNum; 
	secondNum = firstNum - secondNum; 
	firstNum = firstNum - secondNum; 
	
	System.out.println("First number: "+firstNum+"\nSecond number: "+secondNum);*/
        
        
        printNineTable();

    }
    
    
}
