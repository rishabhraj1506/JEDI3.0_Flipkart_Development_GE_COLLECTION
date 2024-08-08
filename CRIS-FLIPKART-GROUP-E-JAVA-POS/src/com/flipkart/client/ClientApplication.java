package com.flipkart.client;

import com.flipkart.business.*;
import java.util.Scanner;

public class ClientApplication {
	public static void main(String[] args) {
		int input=0;
		String username = null,password = null,role = null;
		System.out.println("Welcome to the CRS Application :-->");
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
					registerCourses();
					break;
				case 2:
					viewCourses();
					break;
				case 3:
					viewReport();
					break;
				case 4:
					billingInfo();
					break;
				case 5:
					continue;
				default:
					System.out.println("Invalid");
			}
		}
	}
	
	private static void billingInfo() {
		// TODO Auto-generated method stub
		
	}

	private static void viewReport() {
		// TODO Auto-generated method stub
		
	}

	private static void viewCourses() {
		// TODO Auto-generated method stub
		
	}

	private static void registerCourses() {
		// TODO Auto-generated method stub
		
	}

	public static void studentRegistraion() {
		
	}
	
	public static void updatePassword(String username, String password, String role) {
		
	}
}
