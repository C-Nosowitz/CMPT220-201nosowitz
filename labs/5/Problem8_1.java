import java.util.Scanner;

public class Problem8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double [][] matrix = new double [3][4];
		
		System.out.println("Enter a 3 X 4 matrix: ");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) { 
				matrix [i][j] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of elements in column" + i + " is " + sumColumn(matrix, i));
		}
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		
		double total = 0;
		
		for(int i = 0; i < m.length; i++) {
			total += m[i][columnIndex];
		}
		return total;
	}


}

