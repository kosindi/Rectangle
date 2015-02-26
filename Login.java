/*
 * Kowar Sindi
 * February 25 2015
 * This program asks the user to input the correct username and password.
 * If correct the program outputs a welcoming, if not correct it outputs "Wrong username
 * or password!"
 */

import java.util.Scanner;


public class Login {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String username = "Kowar", password = "Annandale", a, b;
		System.out.println("Hello, enter the correct username and password.");
		a = keyboard.nextLine();
		b = keyboard.nextLine();
		if(username.equalsIgnoreCase(a)&&password.equals(b))
			System.out.println("Welcome " + username + "!");
		else {
			System.out.println("Wrong username or password!");
		keyboard.close();
		}
		
	}

}