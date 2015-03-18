import javax.swing.JOptionPane;


public class IfElse {
	public static void main(String[] args) {
		String number;
		int number1, groupsize;
		number = JOptionPane.showInputDialog("Hello, enter the number of people.");
		number1 = Integer.parseInt(number);
		if (number1>10)
			groupsize = number1/2;
		else if (number1>=3)
			groupsize = number1/3;
		else {
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
			return;
		}
		
		JOptionPane.showMessageDialog(null, "The number of people going on the trip is " 
										+ number1 + " and the group size is " + groupsize + "." );
			
	}

}