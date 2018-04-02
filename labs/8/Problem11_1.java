import java.util.Scanner;

class GeometricObject {
	
	private boolean filled;
	private String color;
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
class Triangle extends GeometricObject{
	
	private double side1;
	private double side2;
	private double side3;
	
	Triangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
		
		Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
	}
		public double getArea() {
			double s = (side1 + side2 + side3)/2;
			return Math.sqrt(s *(s - side1) * (s- side2) * (s - side3));
		}
		public double getPerimeter() {
			return side1 + side2 + side3;
		}
		@Override
		public String toString() {
			return "Triangle: side1 =" + side1 + "side2 =" + side2 + "side3 =" +side3;
		}
}
public class Problem11_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		System.out.println("Enter a color: ");
		String color = input.next();
		System.out.println("Is the triangle filled (true/false)?");
		boolean filled = input.nextBoolean();
		
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);
		
		System.out.println("The area of the triangle is: " + t.getArea());
		System.out.println("The perimeter of the triangle is: " + t.getPerimeter());
		System.out.println("The color of the triangle is: " + t.getColor());
		System.out.println("Is the triangle filled? " + t.isFilled());
		
	}

}
