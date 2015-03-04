import java.util.Scanner;


public class LoginLoop {
	public static void main(String[] args){
		String username = "Kowar", password = "Annandale", a, b;
		System.out.println("Hello, enter the correct username and password.");
		Scanner keyboard = new Scanner (System.in);
		a = keyboard.nextLine();
	    b = keyboard.nextLine();
		
		
		while (!username.equalsIgnoreCase(a)||!password.equals(b))//(!=does not) (||=or)
			
		{
			System.out.println("Hello, enter the correct username and password.");
			a = keyboard.nextLine();
		    b = keyboard.nextLine();
		}
		System.out.println("Welcome " + username + "!");
		keyboard.close();
	}

}