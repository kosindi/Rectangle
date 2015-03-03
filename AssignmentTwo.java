import java.util.Scanner;
import java.text.DecimalFormat;

public class AssignmentTwo {
	public static void main(String[] args) {
		System.out.println("Enter five numbers.");
		Scanner keyboard = new Scanner (System.in);
		double sum, a, b, c, d, e;
		double average;
		java.text.DecimalFormat A = new DecimalFormat("0.00");
		a = keyboard.nextDouble();
		b = keyboard.nextDouble();
		c = keyboard.nextDouble();
		d = keyboard.nextDouble();
		e = keyboard.nextDouble();
		sum = (a+b+c+d+e);
		average = ((a+b+c+d+e)/5);

		double max = Math.max(a, b);
		double max1 = Math.max(c, d);
		double max2 = Math.max(max, e);
		double max3 = Math.max(max1, max2);
		
		double min = Math.min(a, b);
		double min1 = Math.min(c, d);
		double min2 = Math.min(min, e);
		double min3 = Math.min(min1, min2);
		
		System.out.println("The sum of those numbers is " + A.format(sum) + "." +
							"\nThe average of those numbers is " + A.format(average) + "." +
							"\nThe maximum of those numbers is " + A.format(max3) + "." +
							"\nThe minimum of those numbers is " + A.format(min3) + ".");
		
		keyboard.close();//prevents a resource leak
		
	}

}