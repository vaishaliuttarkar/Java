package Studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 100;   //every-time we create ID it will stay with the class.
	
	//Constructor: prompt user to enter students name and year
	public Student() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first name:- ");
		this.firstname = s.nextLine();
		
		System.out.print("Enter last name:- ");
		this.lastname = s.nextLine();
		
		System.out.print("1- Freshmen\n2- Softmore\n3- Junior\n4- Senior\n Enter Student Class level:- ");
		this.gradeyear = s.nextInt();
		
		setstudentId();
		//System.out.print(firstname + " " + lastname + " " + gradeyear + " " + studentId );
		
		
	}
	
	//Generate ID
	private void setstudentId() {
		//Grade level + ID.
		id++; //So every-time we create new students the id will increment by 1
		this.studentId = gradeyear + " " + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//to enroll to the course also add the tuition fee to it.
		do
		{
		System.out.print("\nEnter Course to Enroll (Q to Quit):- ");
		Scanner s = new Scanner(System.in);
		String course = s.nextLine();
		     if(!course.equals("Q"))
		     {
		       courses = courses + "\n  " + course;
		       tuitionBalance = tuitionBalance + costOfCourse;
		     }
		    else
		      {
			   break;
		      }
		} while(1 != 0);
		//System.out.println("Enrolled in:- "+courses);
		//System.out.println("Tuition fees is:- "+tuitionBalance);
	}

	
	//View balance 
	public void viewbalance() {
		System.out.println("Your Tuition Fees Balance is:- $ "+tuitionBalance);
	}
	
	//Pay tuition
	public void paytuition() {
		viewbalance();
		System.out.print("Enter Your Payment:- $");
		Scanner s = new Scanner(System.in);
		int payment = s.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank You for your Payment of $:- "+payment);
		viewbalance();
	}
	
	//Show Status
	public String showInfo() {
		return "Name " + firstname + " " + lastname + 
				"\nGrade Level " + gradeyear +
				"\nStudent-ID " + studentId +
				"\nCourse Name:- " + courses +
				"\nBalance $ " + tuitionBalance + "\n";
	}
}
