package com.challenge;

import java.util.Scanner;
public class StringReverseDemo {
	public static void main(String[] args) {
			System.out.println("Enter a string to reverse");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			for(int i=input.length()-1; i>=0; i--){
					System.out.print(input.charAt(i));
			}
	}
}
