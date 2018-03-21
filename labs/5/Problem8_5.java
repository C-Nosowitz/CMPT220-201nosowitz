import java.util.Scanner;

public class Problem8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 3 X 3 matrix 1: ");
		double [][] matrix1 = new double [3][3];
		for(int i = 0; i < matrix1.length; i++) 
			for(int j = 0; j < matrix1[i].length; j++)  
				matrix1 [i][j] = input.nextDouble();
			
		
		System.out.println("Enter a 3 X 3 matrix 2: ");
		double [][] matrix2 = new double [3][3];
		for(int i = 0; i < matrix2.length; i++) 
			for(int j = 0; j < matrix2[i].length; j++)  
				matrix2 [i][j] = input.nextDouble();
				
		double [][] addedMatrix = addMatrix(matrix1, matrix2);
		
		for (int i1 = 0; i1 < matrix1.length; i1++) {

            for (int k = 0; k < matrix1[i1].length; k++) {
                System.out.printf("%2.1f ", matrix1[i1][k]);
                if (i1 == 1 && k == 2) System.out.printf("%2s ", " + ");
                else System.out.printf("%3s ", " ");
            }
            for (int k = 0; k < matrix2[i1].length; k++) {
                System.out.printf("%2.1f ", matrix2[i1][k]);
                if (i1 == 1 && k == 2) System.out.printf("%2s ", " = ");
                else System.out.printf("%3s ", " ");

            }
            for (int k = 0; k < addedMatrix[i1].length; k++) {
                System.out.printf("%4.1f ", addedMatrix[i1][k]);
            }
            System.out.println("");
            }
		}
	

	
		public static double[][] addMatrix(double[][] a, double[][] b){
			 double[][] addedMatrix = new double[a.length][a[0].length];

		        for (int i = 0; i < a.length; i++) {
		            for (int k = 0; k < a[0].length; k++) {
		                addedMatrix[i][k] = a[i][k] + b[i][k];
		            }
		        }

		        return addedMatrix;
	}
}
