package com.all_in_one;

import java.util.Scanner;

public class attendance_tracker {

	
	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);

		        // 1. Ask CR for total students
		        System.out.print("Enter total number of students in the class: ");
		        int totalStudents = sc.nextInt();

		        // Array for max 30 days
		        int[] attendance = new int[30];
		        int days = 0;

		        // 2. Record attendance using do-while
		        String choice;
		        do {
		            days++;
		            System.out.print("Enter number of students present on day " + days + ": ");
		            attendance[days - 1] = sc.nextInt();
		            sc.nextLine(); // consume newline

		            System.out.print("Do you want to enter another day? (yes/no): ");
		            choice = sc.nextLine();
		        } while (choice.equalsIgnoreCase("yes") && days < 30);

		        // 3a. Calculate average attendance
		        int sum = 0;
		        for (int i = 0; i < days; i++) {
		            sum += attendance[i];
		        }
		        double average = (double) sum / days;

		        // 3b. Identify days with < 50% attendance
		        int lowDays = 0;
		        System.out.println("\nDays with attendance below 50%:");
		        for (int i = 0; i < days; i++) {
		            if (attendance[i] < totalStudents * 0.5) {
		                System.out.println("Day " + (i + 1) + ": " + attendance[i] + " students present");
		                lowDays++;
		            }
		        }

		        // 3c. Print attendance list
		        System.out.println("\n========== ATTENDANCE LIST ==========");
		        System.out.println("Day\tStudents Present");
		        for (int i = 0; i < days; i++) {
		            System.out.println((i + 1) + "\t" + attendance[i]);
		        }

		        // 3d. Print summary
		        System.out.println("\nAverage attendance: " + average);
		        double lowPercent = ((double) lowDays / days) * 100;
		        System.out.println("Percentage of days with low attendance: " + lowPercent + "%");

		        sc.close();
		    }
		

	}


