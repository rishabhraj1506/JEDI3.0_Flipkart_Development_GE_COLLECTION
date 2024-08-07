package com.flipkart.business;

import com.flipkart.bean.*;

public class AdminOperations {
	

    /**
     * Method to add a professor
     * @param professor: the professor to add
     */
    public void addProf(Prof professor) {
    }

    /**
     * Method to remove a professor
     * @param professorID: the ID of the professor to remove
     * @return true if professor was removed successfully, false otherwise
     */
    public boolean removeProf(String professorID) {
        return false; // Professor ID not found
    }

    /**
     * Method to update a course
     * @param courseCode: the code of the course to update
     * @param updatedCourse: the updated course details
     * @return true if course was updated successfully, false otherwise
     */
    public boolean updateCourse(String courseCode, Course updatedCourse) {
        return false;
    }

    /**
     * Method to add a course
     * @param course: the course to add
     */
    public void addCourse(Course course) {
    	//
    }

    /**
     * Method to remove a course
     * @param courseCode: the code of the course to remove
     * @return true if course was removed successfully, false otherwise
     */
    public boolean removeCourse(String courseCode) {
        return false; 
    }

    /**
     * Method to register a student
     * @param student: the student to register
     */
    public void registerStudent(Student student) {
    }
}
