/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        int grades=obj.nextInt();
        
        if(grades<40){
            System.out.println("Failed");
        }else if(grades>=40&&grades<60){
            System.out.println("Passed");
        }else if(grades>=60&&grades<80){
            System.out.println("Good");
        }else if(grades>80){
            System.out.println("Distintion");
        }
	
        obj.close();
    }
    
}
