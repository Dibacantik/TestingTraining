/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;
import java.util.Scanner;
public class minmaxArray {
    static int max(int[] array){
        int max=array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]>max){
                max=array[i];
            }
        }return max;
    }
    
    static int min(int[] array){
        int min=array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }return min;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Size of the array: ");
        int size=obj.nextInt();
        
        System.out.println("Enter the array elements: ");
        int[] array=new int[size];
        for (int i=0; i<size; i++) {
            array[i]=obj.nextInt();
        }
        
        System.out.println("Maximum element: " + max(array));
        System.out.println("Minimum element: " + min(array));
    }
    
}
