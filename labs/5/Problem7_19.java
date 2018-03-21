import java.util.Scanner;

public class Problem7_19 {

	public static void main(String[] args) {
		System.out.println("Enter list: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] list = new int [n];
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = input.nextInt();
		}
		
		if (isSorted(list)) System.out.print("The list is already sorted.\n");
        else System.out.print("The list is not sorted.\n");

	}
		
		public static boolean isSorted(int[] list) {
			int n = list.length - 1;
			boolean isSorted = true;
			
			for (int i = 0; i < n; i++) {
				   if (list[i] > list[i + 1]) {
				    isSorted = false;
				    break;
				   }
				  }
				 
				  return isSorted;

	}

}
