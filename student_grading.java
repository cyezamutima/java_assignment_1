package com.all_in_one;

import java.util.Scanner;

public class student_grading {


	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        int totalStudents = 0;
		        int passes = 0;
		        int fails = 0;

		        while (true) {
		            System.out.print("Enter student's marks (0-100) or -1 to stop: ");
		            int marks = sc.nextInt();

		            if (marks == -1) {
		                break; 
		            }

		            totalStudents = totalStudents + 1;

		            // Add grades in array
		            if (marks >= 80 && marks <= 100) {
		                System.out.println("Grade: A");
		                passes++;
		            } else if (marks >= 70 && marks <= 79) {
		                System.out.println("Grade: B");
		                passes++;
		            } else if (marks >= 60 && marks <= 69) {
		                System.out.println("Grade: C");
		                passes++;
		            } else if (marks >= 50 && marks <= 59) {
		                System.out.println("Grade: D");
		                passes++;
		            } else if (marks >= 0 && marks < 50) {
		                System.out.println("Grade: F");
		                fails++;
		            } else {
		                System.out.println("Invalid marks! Enter 0-100 or -1 to stop.");
		                totalStudents = totalStudents - 1;
		            }

		            System.out.println("-----------------------");
		        }

		        // display
		        System.out.println("\n========== SUMMARY ==========");
		        System.out.println("Total students: " + totalStudents);
		        System.out.println("Passed: " + passes);
		        System.out.println("Failed: " + fails);
		        if (totalStudents > 0) {
		            double passRate = (passes * 100.0) / totalStudents;
		            System.out.println("Class pass rate: " + passRate + "%");
		        }
		        System.out.println("=============================");

		        sc.close();
		    }




	}

