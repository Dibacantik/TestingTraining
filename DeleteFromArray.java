/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day1test;

import java.util.Arrays;

public class DeleteFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int deleteElement = 3;

        System.out.println("Array: " + Arrays.toString(array));

        // element's index that will be deleted
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                indexToDelete = i;
                break;
            }
        }

        // delete the element and rearrange the array
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }

            //resize the element
            array = Arrays.copyOf(array, array.length - 1);

            System.out.println("Array after deletion: " + Arrays.toString(array));
        } else {
            System.out.println("Element is not found.");
        }
    }
}
