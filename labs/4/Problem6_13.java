
public class Problem6_13 {

	public static void main(String[] args) {
		double seriesStart = 1.0;
		double numberOfRows = 20.0;
		
		System.out.println("\ni                m(i)\n" + 
						   "----------------------");
		for(double i = seriesStart; i <= numberOfRows; i++) {
			System.out.printf("%4.1f     ", i);
			System.out.printf("%6.3f\n", sumSeries(i));
		}
	}
		public static double sumSeries(double i2) {
			double sum = 0;
			for (double i = 1; i <= i2; i++) {
				sum += i / (i + 1);
			}
			return sum;
		
		
		}
			

}
