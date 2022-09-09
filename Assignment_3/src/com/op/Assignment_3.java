package com.op;

import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence (any English sentence)");
		String str = sc.nextLine();
		System.out.println("Enter a Letter (any letter from A to Z)");
		String ltr = sc.next();
		int sepPos = str.indexOf(ltr);
		if (sepPos == -1) {
			System.out.println("The letter does not exist in the sentence");
		} else {
			System.out.println("Result: " + str.substring(sepPos + ltr.length()));
		}
	}
}
