package Java8Features;

interface calc1{
	void calculate(int n1, int n2);
	default void calculate(int n1, int n2, int n3) {
		System.out.println("Animal is making sound");
		// body of default 
	}
	static String getInfo() {
			return "This is a static getInfo method inside calc interface";
		}
	private void getPrivateInfo(String msg) { //no one can access this method
		System.out.println(msg);
	}interface Election{
boolean age(int num);	
}
	}
class sum implements calc1{
	@Override
	public void calculate(int n1, int n2) {
		int s = n1 + n2;
		System.out.println("Sum : " + s);
	}
	public void calculate(int n1, int n2, int n3) {
		int s = n1 + n2 + n3;
		System.out.println("Sum : " + s);
		System.out.println("Dog Barks"); // Override the method in interface
	}
}

public class MainInterface {
	public static void main(String[] args) {
		sum s = new sum();
		s.calculate(2, 3);
		s.calculate(2, 3, 4);
		System.out.println(calc1.getInfo());
//		System.out.println(calc.getPrivateInfo()); can't call the private method
	}
}

// use of default keyword with interface
/*
 
 1. In Java, the default keyword is used inside an interface
  to define a method with a body (implementation).
  
 2. Default Method -> Method with body in interface declared using default keyword
 
 3. Protected access specifier works as a private for normal class
 
 4. Static method in Interface ->
 
 5. Private method in Interface ->
  
 6. Interface -> it is a blueprint of a class where we can declare method signature
  and method body before java 1.8 and after that we can use 
  static, private and default methods in Interface. 
 
 7.
 */
