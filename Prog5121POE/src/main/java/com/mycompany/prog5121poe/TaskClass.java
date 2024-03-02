/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

/**
 *
 * @author Deborah
 */
public class TaskClass {   
      
    //creating fields
    protected int _taskTime;
    protected String _description;
    protected String _Id;
    protected String _taskName;
    protected int _taskStat;
    protected int _taskNumber;
    protected String _developerD;

    public String getTaskName() {
        return _taskName;
    }

    public void setTaskName(String taskName) {
        _taskName = taskName;
    }

    public int getTaskStat() {
        return _taskStat;
    }

    public void setTaskStat(int taskStat) {
        _taskStat = taskStat;
    }

    public int getTaskTime() {
        return _taskTime;
    }

    public void setTaskTime(int taskTime) {
        _taskTime = taskTime;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getId() {
        return _Id;
    }

    public void setId(String Id) {
        _Id = Id;
    }

    public String getDeveloperD() {
        return _developerD;
    }

    public void setDeveloperD(String developerD) {
        _developerD = developerD;
    }

    public int getTaskNumber() {
        return _taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        _taskNumber = taskNumber;
    }

    public TaskClass() {
        // empty constructor 
    }

    public TaskClass(String Id, int taskStat, String taskName, String description, String developerD, int taskTime, int taskNumber) {
        // overloaded constructor
        _Id = Id;
        _taskStat = taskStat;
        _description = description;
        _developerD = developerD;
        _taskTime = taskTime;
        _taskNumber = taskNumber;
        _taskName = taskName;
    }

    public boolean checkTaskDescription(String description) {
        if (description.length() <= 50) {

            return true;

        } else {

            System.out.println("Error");
            return false;//created a method to check characters
        }
    }

    public String printTaskDetails(String taskStat, int taskTime, String developerD, String description, String Id, int taskNumber, String taskName) {

        String detailsPrint = "Task status: " + taskStat + "\n Development details: " + developerD +
        "\n Task number: " + taskNumber + "\n Task name: " + taskName
        + "\n Task description: " + description + "\n Task ID: " +_Id + "\n Task duration: " + taskTime + " Hrs";
        
        return detailsPrint;
    }

    public int returnTotalHours(int taskTime) {
        _taskTime += taskTime;
        return _taskTime;
    }

    public void setID() {
        _Id = createTaskID();
    }

    public String createTaskID() {
        String firstTwoLetters, lastThreeLetters;

        firstTwoLetters = _taskName.substring(0, 2);

        lastThreeLetters = _developerD.substring(_developerD.length()-3);
        
        _Id = (firstTwoLetters.toUpperCase() + ":" + _taskNumber + ":" + lastThreeLetters.toUpperCase());
        return _Id;

    }
    
}
