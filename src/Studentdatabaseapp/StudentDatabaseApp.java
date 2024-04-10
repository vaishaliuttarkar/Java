package Studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//for (int i = 0; i < numOfStudents; i++) {
		//	Student s1 = new Student();
			//s1.enroll();
		//	s1.paytuition();
			//System.out.println(s1.showInfo());
		
		//Ask how many new students you want to add
		System.out.println("Enter number of Students to Enroll:- ");
		Scanner s = new Scanner(System.in);
		int numOfStudents = s.nextInt();
		Student[] students = new Student[numOfStudents-1];
		
		//Create n number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].paytuition();
			System.out.println(students[i].showInfo());
			
		}

	}

}
