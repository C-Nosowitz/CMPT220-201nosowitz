import java.util.Scanner;

public class Problem2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter a degree in Celcius: ");
		double Celcius = input.nextDouble();
		
		double Fahrenheit = (9.0 / 5) * (Celcius + 32);
		System.out.println("Celcius " + Celcius + " is " + Fahrenheit 
				+ " in Fahrenheit");
	}

}
