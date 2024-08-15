package com.training;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 15;
		int y = 8;
		int z = 12;

		// Arithmetic Operations

		// Addition operation
		System.out.println("x + y = " + (x + y));

		// Subtraction operation 
		System.out.println("z - y = " + (z - y)); 

		// Multiplication operation
		System.out.println("x * z = " + (x * z));

		// Division operation 
		System.out.println("z / y = " + (z / y)); 

		// Modulus operation
		System.out.println("z % y = " + (z % y)); 

		// Unary Operations

		 // Pre-increment operation 
		System.out.println("++z = " + (++z));

		// Pre-decrement operation
		System.out.println("--y = " + (--y)); 

		// Post-increment operation
		System.out.println("z++ = " + (z++));

		// Post-decrement operation 
		System.out.println("y-- = " + (y--)); 

		System.out.println("z after z++ = " + z);
		System.out.println("y after y-- = " + y);

		// Relational Operations

		// Equal to operation
		System.out.println("x == y = " + (x == y));

		// Not equal to operation 
		System.out.println("x != z = " + (x != z));

		// Greater than operation 
		System.out.println("x > z = " + (x > z)); 
		 
		// Less than operation 
		System.out.println("y < z = " + (y < z)); 

		// Greater than or equal to operation  
		System.out.println("x >= y = " + (x >= y)); 

		// Less than or equal to operation
		System.out.println("z <= y = " + (z <= y)); 

		// Logical Operations
		boolean p = false;
		boolean q = true;

		// Logical AND operation
		System.out.println("p && q = " + (p && q)); 

		// Logical OR operation
		System.out.println("p || q = " + (p || q)); 

		 // Logical NOT operation
		System.out.println("!p = " + (!p));        

		// Assignment Operations

		x = 15;
		y = 8;
		z = 12;
		x += z; // x = x + z

		System.out.println("x += z = " + x);

		z -= y; // z = z - y

		System.out.println("z -= y = " + z);

		x *= y; // x = x * y

		System.out.println("x *= y = " + x);

		z /= y; // z = z / y

		System.out.println("z /= y = " + z);

		x %= z; // x = x % z

		System.out.println("x %= z = " + x);
	}

}
