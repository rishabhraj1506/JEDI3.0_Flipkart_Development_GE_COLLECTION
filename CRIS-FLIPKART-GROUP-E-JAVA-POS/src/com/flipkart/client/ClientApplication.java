package com.flipkart.client;

import com.flipkart.business.*;
import com.flipkart.bean.*;
import java.util.Scanner;

public class ClientApplication {
	
	 private static StudentOperations studentOperations = new StudentOperations();
	 
	public static void main(String[] args) {
		int input=0;
		String username = null,password = null,role = null;
		System.out.println("Welcome to the CRS Application :-->");
		
		testStudentRegistration();
		System.out.println("Press 1:--> Login");
		System.out.println("Press 2:--> Registration of the Student");
		System.out.println("Press 3:--> Update Password");
		System.out.println("Press 4:--> Exit");
		while(input!=4) {
			Scanner s=new Scanner(System.in);
			input=s.nextInt();
			switch(input) {
			case 1:
				System.out.println("Enter the Username :--");
				username=s.next();
				System.out.println("Enter the Password :--");
				password=s.next();
				System.out.println("Role");
				role=s.next();
				if(role.equals("student")) {
					studentMenu(username,password);
				}else if(role.equals("professor")) {
					professorMenu(username,password);
				}else if(role.equals("admin")) {
					adminMenu(username,password);
				}
				break;
			case 2:
				studentRegistraion();
				break;
			case 3:
				updatePassword(username,password,role);
				break;
			case 4:
				continue;
			default:
				System.out.println("Invalid commaand");
			}
		}
	}
	
	private static void adminMenu(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Admin Menu:");
		System.out.println("1. Add Professor\n2. Remove Professor\n3. Modify Course\n4. Add Course\n5. Remove Course\n6. Approve Student Registration\n7. Exit");
		Scanner s=new Scanner(System.in);
		int in =0;
		while(in!=5) {
			in=s.nextInt();
			switch(in) {
				case 1: 
					addProf();
					break;
				case 2:
					removeProf();
					break;
				case 3:
					updateCourse();
					break;
				case 4:
					addCourse();
					break;
				case 5:
					removeCourse();
					break;
				case 6:
					approveRegistration();
					break;
				case 7:
					continue;
				default:
					System.out.println("Invalid");
			}
		}
	}

	private static void approveRegistration() {
		// TODO Auto-generated method stub
		
	}

	private static void removeCourse() {
		// TODO Auto-generated method stub
		
	}

	private static void addCourse() {
		// TODO Auto-generated method stub
		
	}

	private static void updateCourse() {
		// TODO Auto-generated method stub
		
	}

	private static void removeProf() {
		// TODO Auto-generated method stub
		
	}

	private static void addProf() {
		// TODO Auto-generated method stub
		
	}

	private static void professorMenu(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Professor Menu:");
		System.out.println("1. Offer Course\n2. View Registered Students\n3. Submit Grades\n4. Exit");
		Scanner s=new Scanner(System.in);
		int in =0;
		while(in!=4) {
			in=s.nextInt();
			switch(in) {
				case 1: 
					offerCourse();
					break;
				case 2:
					viewRegisteredStudent();
					break;
				case 3:
					submitGrade();
					break;
				case 4:
					continue;
				default:
					System.out.println("Invalid");
			}
		}
	}

	private static void offerCourse() {
		// TODO Auto-generated method stub
		
	}

	private static void viewRegisteredStudent() {
		// TODO Auto-generated method stub
		
	}

	private static void submitGrade() {
		// TODO Auto-generated method stub
		
	}

	private static void studentMenu(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Student Menu:");
		System.out.println("1. Register Courses\n2. View Courses\n3. View Report Card\n4. Billing info\n5. Exit");
		Scanner s=new Scanner(System.in);
		int in =0;
		while(in!=5) {
			in=s.nextInt();
			switch(in) {
				case 1: 
                    System.out.println("Enter course ID to register:");
                    String courseID = s.next();
                    System.out.println("Enter course name:");
                    String courseName = s.next();
                    System.out.println("Enter professor ID:");
                    String courseProf = s.next();
                    System.out.println("Enter number of seats:");
                    int seats = s.nextInt();
                    Course course = new Course(courseID, courseName, courseProf, seats);
                    boolean success = studentOperations.register(username, course);
                    System.out.println(success ? "Course registered successfully." : "Course registration failed.");
                    break;
				case 2:
					viewCourses(username);
					break;
				case 3:
					viewReport(username);
					break;
				case 4:
					billingInfo(username);
					break;
				case 5:
					continue;
				default:
					System.out.println("Invalid");
			}
		}
	}
	
	private static void billingInfo(String username) {
		System.out.println(studentOperations.getBillingInfo(username));
		// TODO Auto-generated method stub
		
	}

	private static void viewReport(String username) {
        System.out.println(studentOperations.getReport(username));
		// TODO Auto-generated method stub
		
	}

	private static void viewCourses(String username) {
        System.out.println("Courses registered:");
        for (Course c : studentOperations.viewCourses(username)) {
            System.out.println(c.getCourseName());
        }
		// TODO Auto-generated method stub
		
	}

	private static void registerCourses() {
		
		// TODO Auto-generated method stub
		
	}

	private static void studentRegistraion() {
	      Scanner s = new Scanner(System.in);
	        System.out.println("Enter Student ID:");
	        String ID = s.next();
	        System.out.println("Enter Student Name:");
	        String name = s.next();
	        System.out.println("Enter Contact:");
	        String contact = s.next();
	        System.out.println("Enter Email:");
	        String email = s.next();
	        System.out.println("Enter Branch:");
	        String branch = s.next();
	        System.out.println("Enter Roll Number:");
	        int rollNum = s.nextInt();
	        Billing billing = new Billing("BILL" + ID, rollNum, 0, false); // assuming a default bill amount and unpaid status
	        Student student = new Student(ID, name, contact, email, branch, rollNum, billing);
	        studentOperations.addStudent(student);
	        System.out.println("Student registered successfully.");
		
	}
	
	
	public static void updatePassword(String username, String password, String role) {
		
	}
	
	
	private static void testStudentRegistration() {
        // Create a student
        Billing billing = new Billing("BILL123", 123, 5000.0f, false);
        Student student = new Student("S123", "John Doe", "1234567890", "john.doe@example.com", "CSE", 123, billing);
        studentOperations.addStudent(student);

        // Register student for courses
        Course course1 = new Course("C101", "Data Structures", "Prof. Smith", 10);
        Course course2 = new Course("C102", "Algorithms", "Prof. Johnson", 10);
        Course course3 = new Course("C103", "Database Systems", "Prof. Lee", 10);
        Course course4 = new Course("C104", "Operating Systems", "Prof. Brown", 10);

        System.out.println("Registering courses for student: " + student.getName());

        boolean reg1 = studentOperations.register(student.getID(), course1);
        boolean reg2 = studentOperations.register(student.getID(), course2);
        boolean reg3 = studentOperations.register(student.getID(), course3);
        boolean reg4 = studentOperations.register(student.getID(), course4);

        System.out.println("Registration status:");
        System.out.println("Course 1: " + (reg1 ? "Success" : "Failed"));
        System.out.println("Course 2: " + (reg2 ? "Success" : "Failed"));
        System.out.println("Course 3: " + (reg3 ? "Success" : "Failed"));
        System.out.println("Course 4: " + (reg4 ? "Success" : "Failed"));

        // View registered courses
        System.out.println("Viewing registered courses:");
        for (Course c : studentOperations.viewCourses(student.getID())) {
            System.out.println(c.getCourseName());
        }

        // Try to register a fifth course, should fail
        Course course5 = new Course("C105", "Computer Networks", "Prof. Davis", 10);
        boolean reg5 = studentOperations.register(student.getID(), course5);
        System.out.println("Registration status for Course 5 (should fail): " + (reg5 ? "Success" : "Failed"));
    }
}
