package com.flipkart.business;

import com.flipkart.bean.*;
import java.util.*;

public class StudentOperations {
	
    private List<Student> students = new ArrayList<>();
    private Map<String, List<Course>> studentCourses = new HashMap<>();
    
    
    /**
     * Method to register the student in a course
     * @param course: the course to register
     * @return true if registration was successful, false otherwise
     */
    public boolean register(String studentID, Course course) {
    	 if (!studentCourses.containsKey(studentID)) {
             studentCourses.put(studentID, new ArrayList<>());
         }
         List<Course> courses = studentCourses.get(studentID);
         if (courses.size() >= 5) {
             return false; // Assuming a student can register for a maximum of 5 courses
         }
         if (course.addStudent(findStudentByID(studentID))) {
             return courses.add(course);
         }
         return false;
    }
    
    /**
     * Method to view courses registered by the student
     * @return list of registered courses
     */
    public List<Course> viewCourses(String studentID) {
        return studentCourses.getOrDefault(studentID, new ArrayList<>());
    }
    
    /**
     * Method to get a report of registered courses
     * @return a string report of registered courses
     */
    public String getReport(String studentID) {
        List<Course> courses = studentCourses.getOrDefault(studentID, new ArrayList<>());
        StringBuilder report = new StringBuilder("Courses registered:\n");
        for (Course course : courses) {
            report.append(course.getCourseName()).append("\n");
        }
        return report.toString();
    }
    
    /**
     * Method to get billing information
     * @return billing information
     */
    public String getBillingInfo(String studentID) {
        for (Student student : students) {
            if (student.getID().equals(studentID)) {
                return student.getBilling().toString();
            }
        }
        return "No billing information found.";
    }
    
    // Additional methods for managing students
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    private Student findStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

}
