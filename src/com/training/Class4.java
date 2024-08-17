package com.training;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numbers from 1 to 100 (Even and Odd):");

        
        for (int i = 1; i <= 100; i++) {
           
            if (i % 2 == 0) {
                // Printing the even numbers
                System.out.println(i + " is even");
            } else {
                // Printing the odd numbers
                System.out.println(i + " is odd");
            }
        }
        
        
        // here taken i = 1
        int i = 1;

        System.out.println("Numbers from 1 to 100 (Even and Odd):");

        while (i <= 100) {
           
            if (i % 2 == 0) {
                // Printing the even numbers
                System.out.println(i + " is even");
            } else {
                // Printing the odd numbers
                System.out.println(i + " is odd");
            }
            i++;
        }
        
      }
   }

                
            
