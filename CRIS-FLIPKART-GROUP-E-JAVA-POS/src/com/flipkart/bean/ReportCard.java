package com.flipkart.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author JEDI-03
 * Class to manage and display a student's report card
 * 
 */
public class ReportCard {

    private int studentID; // ID of the student
    private Map<String, String> grades; // Map to store course IDs and corresponding grades

    /**
     * Parameterized constructor
     * @param studentID: ID of the student
     */
    public ReportCard(int studentID) {
        this.studentID = studentID;
        this.grades = new HashMap<>();
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Map<String, String> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, String> grades) {
        this.grades = grades;
    }
}
