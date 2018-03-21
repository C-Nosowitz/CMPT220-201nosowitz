import java.util.Scanner;

public class Problem7_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int[10];
		int index = 0;
		System.out.println("Enter 10 numbers: ");
		
		for(int i = 0; i < numbers.length; i++) 
		{
			int num = input.nextInt();
			if (isNew(numbers, num)) 
			{
			numbers[index++] = num;
			}
		}
		System.out.println("The number of distinct number are: " + index);
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < index; i++)
		{
			System.out.println(numbers[i] + "");
		}
	}
	public static boolean isNew(int[] numbers, int n) {

		        for (int i : numbers){
		            if (n == i) return false;
		        }
		        return true;
		    }
		
	}

