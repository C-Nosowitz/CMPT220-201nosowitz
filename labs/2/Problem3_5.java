import java.util.Scanner;

public class Problem3_5 {

	public static void main(String[] args) {
		Scanner today = new Scanner(System.in);
		System.out.println("Enter today's day: (Sunday=0, Monday=1, Tuesday=2,...Saturday=6)");
		int day = today.nextInt();
		
			if (day == 0)
				System.out.println("Today's day is Sunday.");
			if (day == 1)
				System.out.println("Today's day is Monday.");
			if (day == 2)
				System.out.println("Today's day is Tuesday.");
			if (day == 3)
				System.out.println("Today's day is Wednesday.");
			if (day == 4)
				System.out.println("Today's day is Thursday.");
			if (day == 5)
				System.out.println("Today's day is Friday.");
			if (day == 6)
				System.out.println("Today's day is Saturday.");
			
			
		Scanner future = new Scanner(System.in);
		System.out.println("Enter the number of days elapsed since today: ");
		int futureDay = future.nextInt();
				
			int futDay = (futureDay + day) % 7;
			
			if (futDay == 0)
				System.out.println("The future day is Sunday.");
			if (futDay == 1)
				System.out.println("The future day is Monday.");
			if (futDay == 2)
				System.out.println("The future day is Tuesday.");
			if (futDay == 3)
				System.out.println("The future day is Wednesday.");
			if (futDay == 4)
				System.out.println("The future day is Thursday.");
			if (futDay == 5)
				System.out.println("The future day is Friday.");
			if (futDay == 6)
				System.out.println("The future day is Saturday.");
			
		today.close();
		future.close();
		
		
		

	}

}
