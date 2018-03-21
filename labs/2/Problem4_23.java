import java.util.Scanner;

public class Problem4_23 {

	public static void main(String[] args) {
		// Get the inputs from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax rate: ");
		double fedTaxRate = input.nextDouble();
		System.out.print("Enter state tax rate: ");
		double stateTaxRate = input.nextDouble();
		System.out.println();
		
		// Calc. gross pay
		double grossPay = hoursWorked * hourlyPayRate;
		
		//Calc. deductions
		double fedTaxWithholding = grossPay * fedTaxRate;
		double stateTaxWithholding = grossPay * stateTaxRate;
		double totalDeductions = fedTaxWithholding + stateTaxWithholding;
		
		// Calc. net pay
		double netPay = grossPay - totalDeductions;
		
		
		// Display payroll info
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Pay rate: " + hourlyPayRate);
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deductions: " );
		System.out.printf("\nFederal Withholding (%.1f%s) %.2f", (fedTaxRate * 100), "%",  fedTaxWithholding);
		System.out.printf("\nState Withholding (%.1f%s) %.2f" , (stateTaxRate * 100), "%",  stateTaxWithholding);
		System.out.printf("\nTotal deductions: %.2f",  totalDeductions);
		System.out.println("\nNet pay: " + netPay);

	}
}


