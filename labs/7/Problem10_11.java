import javafx.scene.shape.Circle;
class Circle2D {
	
	double x;
	double y;
	double radius;
	
	public Circle2D (Circle c) {
		this(c.getCenterX(), c.getCenterY(), c.getRadius());
	}
	public Circle2D (double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public Circle2D() {
		this(0, 0, 1);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {

        return 2 * radius * Math.PI;

    }
    public double distance(double x, double y) {
    	return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
   
    public boolean contains(Circle2D circle2D){
        double distance = distance(circle2D.x, circle2D.y);

        if (distance <= this.radius - circle2D.radius) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean c1ContainsC2(Circle c1, Circle c2) {
        Circle2D cir1 = new Circle2D(c1);
        Circle2D cir2 = new Circle2D(c2);

        return cir1.contains(cir2);
    }

    public static boolean c1OverlapsC2(Circle c1, Circle c2) {
        Circle2D cir1 = new Circle2D(c1);
        Circle2D cir2 = new Circle2D(c2);

        if (cir1.contains(cir2) || cir2.contains(cir1)) return false;

        return cir1.overlaps(cir2);
    }

    public boolean overlaps(Circle2D circle2D) {
        double distance = distance(circle2D.x, circle2D.y);

        if (distance  <= this.radius + circle2D.radius)
            return true;
        else
            return false;

    }

    public String toString() {
        return "Circle2D{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    public boolean contains(double x, double y) {

        double distance = distance(x, y);

        if (distance <= radius) return true;
        else return false;
    }
}

public class Problem10_11 {

	public static void main(String[] args) {
		
		Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("C1 area = " + c1.getArea() + " perimeter = " + c1.getPerimeter());
        System.out.println("Does c1 contain coordinate (3,3)? " + c1.contains(3, 3));
        System.out.println("Does c1 contain circle 2? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does c1 overlap circle 3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}




