import javax.swing.JOptionPane;


public class IfElse2 {
	public static void main(String[] args) {
		String team;
		int team1;
		team = JOptionPane.showInputDialog("Enter the number of people on your team.");
		team1 = Integer.parseInt(team);
		if (team1>=11&&team1<=55)
			JOptionPane.showMessageDialog(null, "The number of people on your team is "
											+ team1/11);
		else 
			JOptionPane.showMessageDialog(null, "Your teamsize is 1.");
	}

}
