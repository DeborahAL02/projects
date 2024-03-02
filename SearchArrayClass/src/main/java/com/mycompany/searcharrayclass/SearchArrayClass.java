/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searcharrayclass;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Deborah
 */
public class SearchArrayClass {

    public static void main(String[] args) {
        
        Scanner store = new Scanner(System.in);
        
        System.out.println("Enter the number of elements");
        int size = store.nextInt();
        
        String[] cars;// the value we store in size determine the size of the array
        cars = new String[size];
        
        for( int i = 0; i < size; i++)
        {
            store.nextLine();
            System.out.println("Enter the brand of your car" + (i+1) + ":");
            cars[i] = store.nextLine();
        }
        
         // the array levels display, envokes the elements in the array 
         // displays the values at the same time
        System.out.println("The og array: "+ Arrays.toString(cars));
        //sort by storing it in a string then you call it 
        Arrays.sort(cars);
        
        System.out.println("The sorted array: " + Arrays.toString(cars));
        
        Arrays.binarySearch(cars,"Polo");
        /*
        if(Arrays.binarySearch(cars,"Polo") > "Polo")
        {
        System.out.println("Item found");
        }else
        {
         System.out.println("Item not found");
        }
        */
    }
}
