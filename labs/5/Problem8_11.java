import java.util.Scanner;

public class Problem8_11 {

	public static void main(String[] args) {
		
		int [][] matrix = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		String binary = decimalToBinaryModified(number);
		
		int bIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix[i].length; k++) {
				int coinSide = (binary.charAt(bIndex++) == '0') ? 0 : 1;
				matrix[i][k] = coinSide;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
				for (int k = 0; k < matrix[i].length; k++) {
					char ch = (matrix[i][k] == 0) ? 'H' : 'T';
					System.out.print(ch + " ");
				}
				System.out.println("");
	}
}
	
	public static String decimalToBinaryModified(int n) { 
	
		StringBuilder s = new StringBuilder();
		while (n != 0) {
			s.append(n & 1);
			n = n >> 1;
		}
		while (s.length() < 9) {
			s.insert(0, "0");
		}
		return s.toString();
		}
	}


