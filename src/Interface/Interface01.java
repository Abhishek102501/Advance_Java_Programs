package Interface;
interface area{
	double pi = 3.14;
	double getArea();
}
class Circle implements area{
	double r;
	Circle(double r){
		this.r = r;
	}
	public double getArea() {
		return (pi * r * r);
	}
	void display() {
//		System.out.println("Area of circle:" + this.getArea());
	}
}
public class Interface01 {
 public static void main(String[] args) {
	Circle c1 = new Circle(14.5);
	c1.display();
	System.out.println("Area of circle: "+ c1.getArea());
	Circle c2 = new Circle(4.9);
	System.out.println("Area of circle: "+ c2.getArea());
	area r1 = new area() {
		@Override
		public double getArea() {
			int l = 10;
			int b = 40;
			return (l * b);
		}
	};
	System.out.println("Area of Rectangle: " + r1.getArea());
 }
}
 