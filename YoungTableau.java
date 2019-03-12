package com;

import java.util.*;

public class YoungTableau {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of rows, m: ");

		int m = in.nextInt();
		System.out.print("Enter number of columns, n: ");
		int n = in.nextInt();

		System.out.println("Enter comma seperated values for tableau: ");

		Scanner in1 = new Scanner(System.in);
		String seq = in1.nextLine();

		String[] tokens = seq.split(",");

		MyArray objA = new MyArray(m, n);

		// inserting comma initial input values in the tableau
		for (int i = 0; i < tokens.length; i++) {
			int values = Integer.parseInt(tokens[i]);
			InsertKey.insert_key(objA, m - 1, n - 1, values);
		}

		// Menu-Driven Code
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Enter 1 to display tableau.");
		System.out.println("Enter 2 for extracting minimum.");
		System.out.println("Enter 3 to insert a element in Young Tableau.");
		System.out.println("Enter 4 to get a sorted sequence.");
		System.out.println("Enter 5 to find out whether the number is present in the stored in m*n tableau.");
		String s = input.next();
		choice = s.charAt(0);

		switch (choice) {
		case '1':
			System.out.println("Tableau is as below");
			// Code for problem statement 1.Draw mxn tableau containing the elements
			objA.printArray();
			break;
		case '2':
			// Code for problem statement 3.Extract minimum value from the sequence
			System.out.println("Tableau is as below");
			objA.printArray();
			Extract ex = new Extract(m, n);
			System.out.println("Extracted minimum value: " + ex.extract_min(objA));
			objA.printArray();
			break;
		case '3':
			// Code for problem statement 4.Insert elements in Young Tableau
			System.out.println("Tableau is as below");
			objA.printArray();
			System.out.println("Enter the number to be inserted");
			Scanner element = new Scanner(System.in);
			int value = element.nextInt();
			InsertKey.insert_key(objA, m - 1, n - 1, value);
			System.out.println("Tableau after inserting new element is as below");
			objA.printArray();
			break;
		case '4':
			System.out.println("Tableau is as below");
			objA.printArray();
			// Code for problem statement 5.Get a sorted sequence
			int[] sortedArr = SortYoungTableau.sortArray(objA, tokens.length, m, n);
			System.out.print("Sorted sequence:");
			for (int i = 0; i < tokens.length; i++)
				System.out.print(sortedArr[i] + "  ");
			break;
		case '5':
			// Code for problem statement 6.Determine whether a given number is stored in a
			// given m×n Young tableau.
			Scanner in2 = new Scanner(System.in);
			System.out.println("Enter the number to determine: ");
			int number = in2.nextInt();
			boolean ch = CheckNumber.find(objA, number, m, n);
			System.out.print(ch);
			break;
		default:
			System.out.println("Error");
		}

	}
}
