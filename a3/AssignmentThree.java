import javax.swing.JOptionPane;


public class AssignmentThree {

	public static void main(String[] args) {
		String username = "Kowar", password = "Annandale", a, b;
		
		for (int i = 0; i<3; i++) {
			a = JOptionPane.showInputDialog("Enter the correct username");
			if (username.equalsIgnoreCase(a))
			 {
				do {b = JOptionPane.showInputDialog("Enter the correct password");
				if (password.equals(b)) {
					JOptionPane.showMessageDialog(null, "Welcome " + username);
					String [] choices = {"Admin", "Student", "Staff"};
					
					boolean isCorrect=false;
					do
					{
						String input = (String) JOptionPane.showInputDialog(null, "Choose account "
								+ "type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
								System.out.println(input);
						 switch (input){
						 case ("Admin") :
							 JOptionPane.showMessageDialog(null, "Wrong account type selected, try again.");
						 break;
						 case("Staff") :
							 JOptionPane.showMessageDialog(null, "Wrong account type selected, try again.");
						 break;
						 case("Student") :
							 JOptionPane.showMessageDialog(null, "Welcome student! You can only read files.");
						 isCorrect=true;
						 break;
						 
						 }
					} while (!isCorrect);
					return;					
				}
				else {i++;} 
				} while (i<3);
				JOptionPane.showMessageDialog(null, "Contact Administrator");
				return;
			 }
			else 
				JOptionPane.showMessageDialog(null, "Invalid username");
		}
		JOptionPane.showMessageDialog(null, "Contact Administrator");
		
	}

}