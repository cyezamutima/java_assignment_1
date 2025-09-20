package individual_work;

import java.util.Scanner;

public class shapes {


	public static void main(String[] args) {
		
		        Scanner input = new Scanner(System.in);
		        boolean continueProgram = true;

		        while (continueProgram) {
		            System.out.println("Select a shape");
		            System.out.println("1. Rectangle");
		            System.out.println("2. Circle");
		            System.out.println("3. Square");
		            System.out.println("4. Triangle");

		            System.out.print("Enter your choice (1-4): ");
		            int choice = input.nextInt();

		            System.out.println("\nWhat would you like to calculate");
		            System.out.println("A. Area");
		            System.out.println("B. Perimeter");
		            System.out.print("Enter your choice (A/B): ");
		            char calcChoice = input.next().toUpperCase().charAt(0);

		            switch (choice) {
		                case 1: // Rectangle
		                    System.out.print("Enter length: ");
		                    double length = input.nextDouble();
		                    System.out.print("Enter width: ");
		                    double width = input.nextDouble();
		                    if (calcChoice == 'A') {
		                        System.out.println("Area of Rectangle = " + (length * width));
		                    } else {
		                        System.out.println("Perimeter of Rectangle = " + (2 * (length + width)));
		                    }
		                    break;

		                case 2: // Circle
		                    System.out.print("Enter radius: ");
		                    double radius = input.nextDouble();
		                    if (calcChoice == 'A') {
		                        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
		                    } else {
		                        System.out.println("Perimeter (Circumference) of Circle = " + (2 * Math.PI * radius));
		                    }
		                    break;

		                case 3: // Square
		                    System.out.print("Enter side: ");
		                    double side = input.nextDouble();
		                    if (calcChoice == 'A') {
		                        System.out.println("Area of Square = " + (side * side));
		                    } else {
		                        System.out.println("Perimeter of Square = " + (4 * side));
		                    }
		                    break;

		                case 4: // Triangle (simple with base & height or perimeter using sides)
		                    if (calcChoice == 'A') {
		                        System.out.print("Enter base: ");
		                        double base = input.nextDouble();
		                        System.out.print("Enter height: ");
		                        double height = input.nextDouble();
		                        System.out.println("Area of Triangle = " + (0.5 * base * height));
		                    } else {
		                        System.out.print("Enter side a: ");
		                        double a = input.nextDouble();
		                        System.out.print("Enter side b: ");
		                        double b = input.nextDouble();
		                        System.out.print("Enter side c: ");
		                        double c = input.nextDouble();
		                        System.out.println("Perimeter of Triangle = " + (a + b + c));
		                    }
		                    break;

		                default:
		                    System.out.println("Invalid choice! Please try again.");
		            }

		            System.out.print("\nWould you like to continue? (yes/no): ");
		            String again = input.next().toLowerCase();
		            if (again.equals("no")) {
		                continueProgram = false;
		            }
		            System.out.println();
		        }

		        System.out.println("Thank you for using the system!");
		        input.close();
		        
		        
		        
		    }
		}



