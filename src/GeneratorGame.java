import javax.swing.JOptionPane;

public class GeneratorGame {
	public static void main(String[] args) {
		int rand, userNum;
		int min = 1, max = 10;
		String tBig = "Sorry the number is too big. ";
		String tSmall = "Sorry the number is too small";
		String uString, message, sInput;

		rand = min + (int) (Math.random() * max);
		sInput = JOptionPane.showInputDialog("Guess the number I am thinking of from 1 to 10");
		userNum = Integer.parseInt(sInput);

		if (userNum > max || userNum < min) {
			message = String.format("The number %d is out of the valid range!", userNum);
			JOptionPane.showMessageDialog(null, message);
		} else {
			if (userNum == rand)
				JOptionPane.showMessageDialog(null, "Congrats, you guessed correctly!");
			else {
				uString = (userNum > rand) ? tBig : tSmall;
				message = String.format("%s\n The Correct number was %d.", uString, rand);
				JOptionPane.showMessageDialog(null, message);
			}
		}
	}
}
