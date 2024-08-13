package com.training;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Team");
		int i = 80;
		double d = 80.00;
		float f = 8.88f;
		long l = 80000L;
        short s = 880;
        byte b = 80;
        char c = 'a';
        
        System.out.println("\n");
        System.out.println("int value: " + i);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("float value: " + f);
        System.out.println("long value: " + l);
        System.out.println("short value: " + s);
        System.out.println("byte value: " + b);

        int[] arr = {18, 28, 38, 48, 58};
        System.out.print("Array values: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        String str = "Charan";
        System.out.print("String: ");
        for (int j = 0; j < str.length(); j++) 
        { 
            System.out.print(str.charAt(j));
        }
        System.out.println("\n");

	}

}
