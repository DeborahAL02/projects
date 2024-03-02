/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prog5121poe;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Deborah
 */
public class Prog5121POE {

    // I choose to make the variables availble to whole prog
    static String userN, passW, nameP, surName, taskName, taskDescrip, devDetails, taskStatus, taskID;
    static String devFirstN, devLastN;
    static Scanner ans = new Scanner(System.in);
    static int flagError, numOfTask, option, option2, taskTime, statOp, taskNum, hoursD;// flagError will be used to find errors
    static LoginCl sc = new LoginCl();// created object to call other method in Login
    static TaskClass mc = new TaskClass();
    static StoreArr rays = new StoreArr();

    public static void main(String[] args) {

        // call methods inside main prog
        userRegistrationInput();
        loginUser();
        mainMenu();

    }

    public static void mainMenu() {
        option = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick one of the following \n Option 1: Add Task \n Option 2: Show Report \n Option 3: Quit"));

        //switch statement (menu)
        do {

            switch (option) {
                case 1:
                    addTasks();
                    JOptionPane.showMessageDialog(null, mc.printTaskDetails(taskStatus, hoursD, devDetails, taskDescrip, taskID, taskNum, taskName));//get taskDescrip 

                    break;
                case 2:
                    //System.out.println("Coming soon ...");
                    showReport();
                    //option = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick one of the following \n Option 1: Add Task \n Option 2: Show Report \n Option 3: Quit"));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "you exited the program");
                    break;
                default:
                    option = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick one of the following \n Option 1: Add Task \n Option 2: Show Report \n Option 3: Quit"));
                    break;
            }
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick one of the following \n Option 1: Add Task \n Option 2: Show Report \n Option 3: Quit"));
        } while (option != 3);

    }

    public static void addTasks() {
    

        numOfTask = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of task"));

        for (int i = 0; i < numOfTask; i++) {

            taskName = (JOptionPane.showInputDialog("Enter the tasks name:"));
            mc.setTaskName(taskName);// to get the taskName from TaskClass 
            rays.arrtaskName.add(taskName); // adds task to array list

            taskDescr();// has the conditions for the task description

            devFirstN = (JOptionPane.showInputDialog("Enter your first name:"));

            devLastN = (JOptionPane.showInputDialog("Enter your last name:"));

            devDetails = devFirstN + " " + devLastN;// the first and last name of the developer
            mc.setDeveloperD(devDetails);
            rays.arrdeveloperD.add(devDetails); // adds task to array list

            taskTime = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration of the task in hours"));
            mc.setTaskTime(taskTime);// the duration of the task 
            hoursD = mc.returnTotalHours(taskTime);
            rays.arrtaskTime.add(hoursD); // adds task to array list

            statOp = Integer.parseInt(JOptionPane.showInputDialog("Pick a number for the status of the task:\n 1: TO do \n 2: Doing \n 3: Done"));
            // the status of the task 
            switch (statOp) {
                case 1 ->
                    taskStatus = "To do";

                case 2 ->
                    taskStatus = "Doing";

                case 3 ->
                    taskStatus = "Done";

            }
            mc.setTaskStat(taskTime);
            rays.arrtaskStat.add(taskStatus); // adds task to array list

            mc.setID();
            taskID = mc.createTaskID();
            rays.arrarrtaskId.add(taskID);  // adds task to array list
            
            ++taskNum;
            mc.setTaskNumber(taskNum);
            rays.arrtaskNumber.add(taskNum);  // adds task to array list
        }

    }

    public static void taskDescr() {
        // print the task description      
        taskDescrip = (JOptionPane.showInputDialog("Enter the task description"));
        mc.setDescription(taskDescrip);
        do {
            if (mc.checkTaskDescription(taskDescrip)) {
                //System.out.println("Task successfully captured");
                JOptionPane.showMessageDialog(null, "Task successfully captured");

            } else {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                mc.setDescription(taskDescrip);
            }

        } while (!mc.checkTaskDescription(taskDescrip));
        rays.arrtaskDescription.add(taskDescrip);
    }

    //I went with the idea of a flag to allow the user to re enter 
    public static void userRegistrationInput() {
        flagError = 0;// user registration still pending  

        while (flagError == 0) {

            UserNameMod();
            PasswordMod();

            //user input
            inputWholeN();

            System.out.println(sc.registerUser());
            if (sc.getRegistrationCheck()) {
                flagError = 1; // registration successful
            } else {
                flagError = 0;
                // sc.getRegistrationCheck();
            }
        }
    }

    public static void showReport() {
        do {
            option2 = Integer.parseInt(JOptionPane.showInputDialog("""
                                                      Enter the number of to perform a task :
                                                       1: Display develper details for done tasks 
                                                       2: Task with longest duration
                                                       3: Show report
                                                       4: Search for a task by name
                                                       5: Search for a task by developer
                                                       6: Remove a task
                                                       7: Go back"""));
            switch (option2) {
                case 1 ->
                    //Display develper details for done tasks 
                    rays.displayDoneTask();
                case 2 ->
                    rays.longestTime();
                //Task with longest duration
                case 3 ->
                    rays.displayReport();
                    
                // display report
                case 4 ->
                    searchT();
                // search for task name
                case 5 ->
                    searchD();
                // search for task developer
                case 6 ->
                    removeTask();
            }
        } while (option2 != 7);
    }

    public static void searchT() {         
        rays.searchTName();
        // Search for task name and displays it        
    }

    public static void searchD() {       
        rays.searchDDeveloper();
        // Search for task name and displays it 
       // rays.CheckdisplaydevDetails(devDetails);
    }

    public static void removeTask() {
        JOptionPane.showInputDialog("Enter the task name to delete a task");
        rays.deleteTask(taskName);
    }

    /*this modules here will check if the password 
            and username meet the condtions */
    public static void UserNameMod() {
        System.out.println("---------------------------------");
        System.out.println("Enter your username");
        userN = ans.nextLine();
        sc.setUsername(userN);
        do {

            if (sc.checkUserName(userN)) { // checks the condition here
                System.out.println("Username successfully captured");

            } else {
                System.out.println("Re-enter your username again: ");
                userN = ans.nextLine();
                sc.setUsername(userN);
                //user1.setUsername(strUsername);
            }
        } while (!sc.checkUserName(userN));// if false loop

    }

    public static void PasswordMod() {
        System.out.println("---------------------------------");
        System.out.println("Enter your password");
        passW = ans.nextLine();
        sc.setPassword(passW);

        do {
            if (sc.checkPasswordComplexity(passW)) {
                System.out.println("Password successfully captured");
            } else {
                System.out.println("Re-enter your password again ");
                passW = ans.nextLine();
                sc.setPassword(passW);
                //  user1.setUsername(strPassword);
            }
        } while (!sc.checkPasswordComplexity(passW));

    }

    public static void loginUser() {
        flagError = 0;

        while (flagError == 0) {

            System.out.println("Login details: ");
            System.out.println("=================== ");
            System.out.println("login with your username:");
            System.out.println("---------------------------------");
            userN = ans.nextLine();

            System.out.println("---------------------------------");
            System.out.println("login with  your password");
            passW = ans.nextLine();
            //System.out.println("username login:");

            do {
                if (sc.loginUser(userN, passW)) {
                    System.out.println(sc.returnLoginStatus());
                    JOptionPane.showMessageDialog(null, String.format("Welcome %s, %s, ito EasyKanban", sc.getFirstName(), sc.getLastName()));
                    flagError = 1;
                } else {

                    System.out.println("Username or password incorrect, please try again");

                    // re-enter both the username and the password
                    System.out.println("---------------------------------");
                    System.out.println("Re-enter Username:");
                    userN = ans.nextLine();
                    System.out.println("---------------------------------");
                    System.out.println("Re-enter Password:");
                    passW = ans.nextLine();

                }
            } while (!sc.loginUser(userN, passW));
            //flagError =0;
        }

    }

    public static void inputWholeN() {
        // completing registration data input 
        System.out.println("=================== ");
        System.out.println("Personal Details ");
        System.out.println("=================== ");
        System.out.println("Enter your name");
        nameP = ans.nextLine();
        sc.setFirstName(nameP);

        System.out.println("Enter your surname");
        surName = ans.nextLine();
        sc.setLastName(surName);
    }
}
/*
Referencing
Geek for Geeks.2021.Scope of variables in java
,30 December 2021.[Online].Available at:https://www.geeksforgeeks.org/variable-scope-in-java/.
[Accessed 21 April 2023]

C#Corner.2021.Get string asii value in c#
,21 June 2021.[Online].Available at:https://www.c-sharpcorner.com/article/get-string-ascii-value/.
[Accessed 21 April 2023]

Farrel,J.2019.Java TM Programming.9th ed. Boston:MA 02210; Cengage. 
  Geek for Geeks.2021.Scope of variables in java
,30 December 2021.[Online].Available at:https://www.geeksforgeeks.org/substring-in-java/?ref=gcse
[Accessed 21 May 2023]

Verma, J. 2022.Digital Ocean. How to remove array elements in java, 03 August 2022.[Online]. Availble at: 
https://www.digitalocean.com/community/tutorials/java-remove-array-elements#3-deleting-element-by-its-value-when-the-array-contains-duplicates
[Accessed 04 June 2023]
 */


