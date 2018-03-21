import java.util.Scanner;

public class Problem4_21 {

	public static void main(String[] args) {
		// Get the SSN candidate from the user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		String ssn = input.nextLine();
		boolean valid = true;
		
		// Check for length
		if(ssn.length() != 11)
			valid = false;
		// Check for digits
		else {
			for (int i=0; i<11; i++) {
				if (i == 3 || i == 6) continue;
				if (!Character.isDigit(ssn.charAt(i)))
					valid = false;
			}
		}
		// Check for hyphens
		if (valid && !(ssn.charAt(3) == '-' && ssn.charAt(6) == '-'))
			valid = false;
		// Output
		System.out.println(ssn + " is " + ((valid) ? "a valid " : "an invalid ")
				+ "social security number");
	}

}
