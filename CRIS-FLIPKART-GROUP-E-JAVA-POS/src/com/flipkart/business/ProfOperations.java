package com.flipkart.business;

import com.flipkart.bean.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ProfOperations {
    

    /**
     * Method to offer a course
     * @param course: the course to be offered
     */
    public void offerCourse(Course course) {
        //
    }

    /**
     * Method to get the registered students for a given course
     * @param course: the course for which to get the registered students
     * @return set of registered students
     */
    public Set<Student> getRegisteredStudents(Course course) {
        return new HashSet<>();
    }

    /**
     * Method to give a grade to a student in a course
     * @param course: the course in which the grade is to be given
     * @param student: the student to whom the grade is to be given
     * @param grade: the grade to be given
     * @return true if grade was successfully assigned, false otherwise
     */
    public boolean giveGrade(Course course, Student student, String grade) {
        return false; // Student is not registered for the course
    }
}
