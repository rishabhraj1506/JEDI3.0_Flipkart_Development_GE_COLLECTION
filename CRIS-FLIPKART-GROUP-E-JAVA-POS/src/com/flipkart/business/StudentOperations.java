package com.flipkart.business;

import com.flipkart.bean.*;
import java.util.ArrayList;

public class StudentOperations {
    
    
    /**
     * Method to register the student in a course
     * @param course: the course to register
     * @return true if registration was successful, false otherwise
     */
    public boolean register(Course course) {
        return false; 
    }
    
    /**
     * Method to view courses registered by the student
     * @return list of registered courses
     */
    public ArrayList<Course> viewCourses() {
        return new ArrayList<Course>();
    }
    
    /**
     * Method to get a report of registered courses
     * @return a string report of registered courses
     */
    public String getReport() {
        return "report";
    }
    
    /**
     * Method to get billing information
     * @return billing information
     */
    public String getBillingInfo() {
        return "billing info";
    }
}
