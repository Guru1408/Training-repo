package com.training;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numbers from 1 to 100 (Even and Odd):");

        // Using a for loop to iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                // Print the even number
                System.out.println(i + " is even");
            } else {
                // Print the odd number
                System.out.println(i + " is odd");
            }
        }
        
        
        int i = 1; // Initialize counter variable

        System.out.println("Numbers from 1 to 100 (Even and Odd):");

        // Using a while loop to iterate from 1 to 100
        while (i <= 100) {
            // Check if the number is even
            if (i % 2 == 0) {
                // Print the even number
                System.out.println(i + " is even");
            } else {
                // Print the odd number
                System.out.println(i + " is odd");
            }
            i++; // Increment the counter variable
        }
        
      }
   }

                
            
