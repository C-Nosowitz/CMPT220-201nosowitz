
class MyRec2 {
	
	private double width;
	private double height;
	
	public MyRec2() {
		this.width = 1.0;
		this.height = 1.0;
	}
	public MyRec2(double width, double height) {
        this.width = width;
        this.height = height;
	}
	public double getArea() {
		return this.width * this.height;
	}
	public double getPerimeter() {
		return this.width * 2 + this.height * 2;
	}
}

public class Problem9_1 {
	
	public static void main(String[] args) {	
		MyRec2 [] rectangles = new MyRec2 [2];
		
		 rectangles[0] = new MyRec2(4,40);
	     rectangles[1] = new MyRec2(3.5, 35.9);
	     
	     for (int i = 0; i < 2; i++){
	            System.out.println("MyRec2 " + (i+1) +":");
	            System.out.print("Area = " + rectangles[i].getArea());
	            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
	        }
 	}

}
