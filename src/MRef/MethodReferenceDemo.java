/* 
✔ instance method reference → object::method
✔ Static method reference → ClassName::method
✔ Nested interface access → OuterClass.InnerInterface*/
package MRef;
class Calculator01{
	Calculator01(){
		System.out.println("Constructor Called!");
	}
	Calculator01(int n1, int n2){
		System.out.println("Division: " + (n1/n2));
	}
	int sub(int n1, int n2) {
		return n1 - n2;
	}
	static int mul(int n1, int n2) {
		return n1*n2;
	}
	@FunctionalInterface
	interface Calc{
		int cal(int n1, int n2);
	}
}
public class MethodReferenceDemo {
public static void main(String[] args) {
	Calculator01 c = new Calculator01();
	//Normal Method Call
	int r = c.sub(100, 23);
	System.out.println("Normal Subtraction: " + r);
	
	//Method Reference (Instance Method)
	Calculator01.Calc c1 = c::sub;
	int r1 = c1.cal(100, 23);
	System.out.println("Method Reference Subtraction: " + r1);
	
	//Static Method Reference
	Calculator01.Calc c2 = Calculator01::mul;
	int r2 = c2.cal(12,5);
	System.out.println("Multiplication using Method Reference: " + r2);
}
}
