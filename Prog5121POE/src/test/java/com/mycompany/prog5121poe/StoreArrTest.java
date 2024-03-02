/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog5121poe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Deborah
 */
public class StoreArrTest {
    
    public StoreArrTest() {
    }

    @Test
    public void testLongestTime() {
        System.out.println("Glenda Oberholzer: 11");
        StoreArr instance = new StoreArr();
        instance.longestTime();
        
    }
    
    @Test
    
  
    public void testCheckdisplaydevDetails() {
        System.out.println("CheckdisplaydevDetails");
        String devDet = "";
        StoreArr instance = new StoreArr();
      
    }

    @Test
    public void testDisplayDoneTask() {
        System.out.println("displayDoneTask");
        StoreArr instance = new StoreArr();
        instance.displayDoneTask();
        
    }

    @Test
    public void testDeleteTask() {
        System.out.println("Create reports -successfully deleted");
        String deleteTask = "Create Reports";
        StoreArr instance = new StoreArr();
        instance.deleteTask(deleteTask);
      
    }

    @Test
    public void testDisplayReport() {
        System.out.println("displayReport");
        StoreArr instance = new StoreArr();
        instance.displayReport();         
        
        instance.arrdeveloperD.add("Mike Smith");
        instance.arrarrtaskId.add(" ");
        instance.arrtaskName.add("Create Login");
        instance.arrtaskTime.add(1);
        instance.arrtaskStat.add("To Do");
        instance.arrtaskNumber.add(0);
        instance.arrtaskDescription.add(" ");
       
        instance.arrdeveloperD.add("Edward Harrison");
        instance.arrarrtaskId.add(" ");
        instance.arrtaskName.add("Create Add Features");
        instance.arrtaskTime.add(8);
        instance.arrtaskStat.add("Doing");
        instance.arrtaskNumber.add(1);
        instance.arrtaskDescription.add(" ");
        
        instance.arrdeveloperD.add("Samantha Paulson");
        instance.arrarrtaskId.add(" ");
        instance.arrtaskName.add("Create Reports");
        instance.arrtaskTime.add(2);
        instance.arrtaskStat.add("Done");
        instance.arrtaskNumber.add(2);
        instance.arrtaskDescription.add(" ");
        
        instance.arrdeveloperD.add("Glenda Oberholzer");
        instance.arrarrtaskId.add(" ");
        instance.arrtaskName.add("Add Arrays");
        instance.arrtaskTime.add(11);
        instance.arrtaskStat.add("To Do");
        instance.arrtaskNumber.add(3);
        instance.arrtaskDescription.add(" ");
    }

    @Test
    public void testSearchTName() {
        System.out.println("Create Login");
        System.out.println("Mike Smith");
        StoreArr instance = new StoreArr();
        instance.searchTName();
        
    }

    @Test
    public void testSearchDDeveloper() {
        System.out.println("Samantha Paulson");
        System.out.println("Create Reports");
        StoreArr instance = new StoreArr();
        instance.searchDDeveloper();
       
    }
    
}
