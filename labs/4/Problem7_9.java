import java.util.Scanner;

public class Problem7_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] numbers = new double [10];
		System.out.println("Enter 10 numbers:");
	
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.printf("The minimum number is: %.1f",min(numbers));
	}
		
	public static double min(double[] array) {
		double min = array[0];
		for(double numbers : array) {
			if(numbers < min)
				min = numbers;
				
		}
		return min;
	}

}
