package funInt;
interface calc{
	void calculate();
}

public class Calculation {
public static void main(String[] args) {
	calc c = new calc() {
		@Override
		public void calculate() {
			System.out.println("Sum : ");
	}};
	
	// No parameter, no return type
	calc c1 = ()->{
		System.out.println("This is lambda!");
	};
	c1.calculate();
	
	calc c2 = ()-> System.out.println("This is single line lambda");
	c2.calculate();
	
	calc c3 = ()->{
		int num1 = 12, num2 = 12;
		System.out.println("Sum : "+ (num1 + num2));
	};
	c3.calculate();
}
}
