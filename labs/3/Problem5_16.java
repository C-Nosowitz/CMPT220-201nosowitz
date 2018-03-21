import java.util.Scanner;

public class Problem5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any integer");
		
		int number = input.nextInt();
		int index = 2;
		
		while (number / index != 1) {
		
			if (number % index == 0) 
			{
					System.out.println(index + ",");
					number /= index;
			}
			else 
				index++;

			}
			System.out.println(number + ".");
	}
}
