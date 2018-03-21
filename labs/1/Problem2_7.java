import java.util.Scanner;

public class Problem2_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt user
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		// Calculate years and remaining days
		long years = minutes / (365 * 24 * 60);
		long days = minutes % (365 * 24 * 60);
		
		// Output the results
		System.out.println(minutes + " minutes is approximately "
				+ years + " years and " + days + " days");

	}

}
