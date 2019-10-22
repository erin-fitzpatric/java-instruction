package ui;

import util.Console;

import java.util.Arrays;

import business.Student;


public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("The Students Scores Application\n");

		int nbrOfStudents = Console.getInt("Number of Students: ", 0, 501); // prompt for input
		
		Student[] students = new Student[nbrOfStudents]; // create array
		
		for (int i = 0; i < nbrOfStudents; i ++) {
			System.out.println("\nSTUDENT " + (i+1));
			String ln = Console.getString("Last Name: ");
			String fn = Console.getString("First Name: ");
			int s = Console.getInt("Score: ", -1, 101);
			Student student = new Student(ln, fn, s);
			students[i] = student;
	
		}
		// biz logic
		Arrays.sort(students);
		
		System.out.println("\nSUMMARY");
		for (Student s: students) {
			System.out.println(s);
		}
		
		System.out.println("\nGoodbye!");
	}

}
