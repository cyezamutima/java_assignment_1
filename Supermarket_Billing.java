package com.all_in_one;

import java.util.Scanner;

public class Supermarket_Billing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of items: ");
		        int n = sc.nextInt();
		        sc.nextLine(); // consume newline

		        double totalBill = 0; 
		        // total before discount

		        // add items in array
		        for (int i = 1; i <= n; i++) {
		            System.out.println("\nItem " + i + ":");

		            System.out.print("Enter item name: ");
		            String name = sc.nextLine();

		            System.out.print("Enter price per unit: ");
		            double price = sc.nextDouble();

		            System.out.print("Enter quantity purchased: ");
		            int qty = sc.nextInt();
		            sc.nextLine(); // consume newline

		            // 4. Calculate subtotal
		            double subtotal = price * qty;
		            totalBill += subtotal;

		            // Show item info immediately
		            System.out.println("Item: " + name);
		            System.out.println("Quantity: " + qty);
		            System.out.println("Price per unit: " + price);
		            System.out.println("Subtotal: " + subtotal);
		            System.out.println("---------------------------");
		        }

		        // 5. discount 
		        double discount = 0;
		        if (totalBill > 50000) {
		            discount = totalBill * 0.05;
		        }
		        double finalAmount = totalBill - discount;

		        // 6. Print final receipt
		        System.out.println("\n========== RECEIPT ==========");
		        System.out.println("Grand Total: " + totalBill);
		        System.out.println("Discount: " + discount);
		        System.out.println("Final Amount Payable: " + finalAmount);
		        System.out.println("=============================");

		        sc.close();
		    }
		}
