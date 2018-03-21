import java.util.Scanner;

public class Problem6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter any number, n");
		int n = input.nextInt();
		
           printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int column = 0; column < n; column++) {

            for (int row = 0; row < n; row++) {
                System.out.printf("%1d ", (int)(Math.random() * 2));
            }
            System.out.println("");
        }

}
	
}
