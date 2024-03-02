 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Deborah
 */
public class StoreArr {

    ArrayList<String> arrtaskName = new ArrayList<>();
    ArrayList<String> arrtaskDescription = new ArrayList<>();
    ArrayList<String> arrdeveloperD = new ArrayList<>();
    ArrayList<String> arrarrtaskId = new ArrayList<>();
    ArrayList<Integer> arrtaskTime = new ArrayList<>();
    ArrayList<String> arrtaskStat = new ArrayList<>();
    ArrayList<Integer> arrtaskNumber = new ArrayList<>();

    public void longestTime() {
        int longT = -1;
        int index = -1;

        for (int x = 0; x < arrtaskTime.size(); x++) {
            if (arrtaskTime.get(x) > longT) {
                longT = arrtaskTime.get(x);
                index = x; // saving which cell it was found in
            }
        }

        JOptionPane.showMessageDialog(null, """
                                       The Developer with the longest duration
                                       Developer:  """ + arrdeveloperD.get(index) + "Duration:" + arrtaskTime.get(index));
        //System.out.println("Name " + arrtaskTime.get(index));//display the developer with the highest duration

    }

    public void CheckdisplaydevDetails(String devDet) {// this method checks if the search developer exits or not 
        int Flag = 0;

        for (int i = 0; i < arrdeveloperD.size(); i++) {
            if (arrdeveloperD.get(i).equalsIgnoreCase(devDet)) {

            }
            if (arrdeveloperD.get(i).equalsIgnoreCase(devDet)) {

            }
            if (arrdeveloperD.get(i).equalsIgnoreCase(devDet)) {
                Flag = 1;// the flag spots the null or incorrect developer name
            }
        }
        if (Flag == 0) {
            JOptionPane.showMessageDialog(null, "Developer does not exist");
        }

    }

    public void displayDoneTask() {// displays the task name and status of tasks that are done
        String doneTasks = "";

        for (int i = 0; i < arrtaskStat.size(); i++) {
            if (arrtaskStat.get(i).contains("Done")) {
                doneTasks += ("\n Task Name :    " + arrtaskName.get(i)
                        + "\n Developer :    " + arrdeveloperD.get(i)
                        + "\n Duration  :    " + arrtaskTime.get(i));
                JOptionPane.showMessageDialog(null, "Details of all tasks that are done: " + doneTasks);
            } else {
                JOptionPane.showMessageDialog(null, "There are no tasks that are done ");
            }

        }
    }

    public void deleteTask(String deleteTask) {

        for (int i = 0; i < arrtaskName.size(); i++) {
            if (arrtaskName.get(i).equalsIgnoreCase(deleteTask)) {
                arrdeveloperD.remove(i);
                arrarrtaskId.remove(i);
                arrtaskName.remove(i);
                arrtaskTime.remove(i);
                arrtaskStat.remove(i);
                arrtaskNumber.remove(i);
                arrtaskDescription.remove(i);
                JOptionPane.showMessageDialog(null, "task has been removed");
            }
        }

    }

    public void displayReport() {
        String taskID, taskName, taskDesc, taskDev, taskStat;
        int taskTime, taskNum;

        for (int indexI = 0; indexI < arrtaskName.size(); indexI++) {
            taskName = arrtaskName.get(indexI);
            taskStat = arrtaskStat.get(indexI);
            taskDev = arrdeveloperD.get(indexI);
            taskID = arrarrtaskId.get(indexI);
            taskTime = arrtaskTime.get(indexI);
            taskNum = arrtaskNumber.get(indexI);
            taskDesc = arrtaskDescription.get(indexI);

            JOptionPane.showMessageDialog(null, """
                                                    Report of task: 
                                                   Task: """ + taskNum
                    + "\nTask Name: " + taskName
                    + "\nName of Developer: " + taskDev
                    + "\nTask ID: " + taskID
                    + "\nTask Description: " + taskDesc
                    + "\nDuration of Task: " + taskTime
                    + "\nStatus of Task: " + taskStat);

        }
    }

    public void searchTName() {
        String tName = JOptionPane.showInputDialog("Enter the task name you wish to search");
        int FlagError = 0;
        int foundIndex = -1;

        for (int intIndex = 0; intIndex < arrtaskName.size(); intIndex++) {
            if (arrtaskName.get(intIndex).equals(tName)) {               
                FlagError = 1;
                foundIndex = intIndex; // saving which cell it was found in
            }
        }

        if (FlagError == 0) {//searches for the task name
            JOptionPane.showMessageDialog(null, "Task name was not found");
        } else {
            JOptionPane.showMessageDialog(null, """
                                                Task name details: 
                                                TaskName: """+ arrtaskName.get(foundIndex)
                    + "\nDeveloper: " + arrdeveloperD.get(foundIndex)
                    + "\nStatus: " + arrtaskStat.get(foundIndex));// the index

        }
    }

    public void searchDDeveloper() {
       String devName = JOptionPane.showInputDialog("Enter the developers name you wish to search");
        int FlagError = 0;
        int foundVar = -1;

        for (int intIndex = 0; intIndex < arrdeveloperD.size(); intIndex++) {
            if (arrdeveloperD.get(intIndex).equals(devName)) {
                FlagError = 1;
                foundVar = intIndex; // saving which cell it was found in
            }
        }

        if (FlagError == 0) {
            JOptionPane.showMessageDialog(null, "Developer was not found");
        } else {
            JOptionPane.showMessageDialog(null, """
                                                Developer details: 
                                                Name: """ + arrtaskName.get(foundVar) + 
                                                "\nStatus: " + arrtaskStat.get(foundVar));
        }
    }
}
/*   public void searchName(String Tnsearch) {

        ArrayList<String> searchTname = new ArrayList<>();

        if (arrtaskName.isEmpty()) {
           JOptionPane.showMessageDialog(null,"Task name was found");
        } else {
            for (int i = 0; i < arrtaskName.size(); i++) {
                if (arrtaskName.get(i).equalsIgnoreCase(Tnsearch)) {
                    searchTname.add(arrtaskName.get(i));
                    for (int r = 0; r < searchTname.size(); r++) {
                       JOptionPane.showMessageDialog(null, _displayTname += "\n Task name " + searchTname.get(r));
                    }
                }
            }
        }
        if (_displayTname.equals(" ")) {
            JOptionPane.showMessageDialog(null,_displayTname = "Task name was not found");
        }

    }

    public void searchDeveloper(String devSearch) {
        //String displayTDeve ="";
        ArrayList<String> searchDevNa = new ArrayList<>();

        if (arrtaskStat.isEmpty()) {
           JOptionPane.showMessageDialog(null,"Task name was found");
        } else {
            for (int i = 0; i < arrtaskStat.size(); i++) {
                if (arrtaskStat.get(i).equalsIgnoreCase(devSearch)) {
                    searchDevNa.add(arrtaskStat.get(i));
                    for (int r = 0; r < searchDevNa.size(); r++) {
                      JOptionPane.showMessageDialog(null,  _displayTDeve += "\n Task status " + searchDevNa.get(r));
                    }
                }
            }
        }
        if (_displayTDeve.equals(" ")) {
            JOptionPane.showMessageDialog(null,_displayTDeve = "Task name was not found");
        }
public void displayDoneTask() {// displays the task name and status of tasks that are done
        String checkTarr = "";
        ArrayList<String> arrfoundTN = new ArrayList<>();
        ArrayList<Integer> arrfoundTime = new ArrayList<>();

        for (int i = 0; i < arrtaskName.size(); i++) {
            if (arrtaskStat.get(i).contains("Done")) {
                arrfoundTN.add(arrtaskName.get(i));
                arrfoundTime.add(arrtaskTime.get(i));
                checkTarr += ("\n Task name " + arrfoundTN.get(i) + "\n Task duration " + arrfoundTime.get(i));
            }
            JOptionPane.showMessageDialog(null, "Details of all tasks that are done: " + checkTarr);
        }

    }
    }*/
