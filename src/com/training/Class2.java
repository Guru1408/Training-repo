package com.training;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Team, Going good with Java :)");
		String str = "Going good with Java";

        int length = str.length();
        char charAt = str.charAt(0);
        String substring1 = str.substring(6);
        String substring2 = str.substring(6, 20);
        boolean contains = str.contains("Java");
        boolean equals = str.equals("going good with java");
        boolean equalsIgnoreCase = str.equalsIgnoreCase("going good With Java");
        int compareTo = str.compareTo("Going good with Java");
        int compareToIgnoreCase = str.compareToIgnoreCase("Going good with Java");
        int indexOfChar = str.indexOf('G');
        int indexOfStr = str.indexOf("Good");
        int lastIndexOfChar = str.lastIndexOf('G');
        boolean startsWith = str.startsWith("Let'G");
        boolean endsWith = str.endsWith("a");
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        String trimmed = str.trim();
        String replacedChar = str.replace('J', 'Z');
        String replacedSeq = str.replace("Good", "Fast");
        String[] split = str.split("G");
        boolean isEmpty = str.isEmpty();
        String joined = String.join(", ", "Good", "is", "fun");
        String valueOfInt = String.valueOf(123);
        char[] charArray = str.toCharArray();
        String interned = str.intern();
        boolean matches = str.matches("Going good with Java");
        String formatted = String.format("I have %d apples", 10);

        
        System.out.println("Length: " + length);
        System.out.println("Character at index 0: " + charAt);
        System.out.println("Substring from index 6: " + substring1);
        System.out.println("Substring from index 6 to 20: " + substring2);
        System.out.println("Contains 'JAVA': " + contains);
        System.out.println("Equals 'Going good with Java': " + equals);
        System.out.println("Equals ignore case 'Going good with Java': " + equalsIgnoreCase);
        System.out.println("Compare to 'Going good with Java': " + compareTo);
        System.out.println("Compare to ignore case 'Going good with Java': " + compareToIgnoreCase);
        System.out.println("Index of 'G': " + indexOfChar);
        System.out.println("Index of 'Good': " + indexOfStr);
        System.out.println("Last index of 'G': " + lastIndexOfChar);
        System.out.println("Starts with 'Let'G': " + startsWith);
        System.out.println("Ends with 'a': " + endsWith);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Trimmed: '" + trimmed + "'");
        System.out.println("Replaced 'J' with 'Z': " + replacedChar);
        System.out.println("Replaced 'Good' with 'Fast': " + replacedSeq);
        System.out.println("Split by 'G': " + java.util.Arrays.toString(split));
        System.out.println("Is empty: " + isEmpty);
        System.out.println("Joined: " + joined);
        System.out.println("Value of int 123: " + valueOfInt);
        System.out.println("Character array: " + java.util.Arrays.toString(charArray));
        System.out.println("Interned string: " + interned);
        System.out.println("Matches 'Going good with Java': " + matches);
        System.out.println("Formatted string: " + formatted);
	}

}
