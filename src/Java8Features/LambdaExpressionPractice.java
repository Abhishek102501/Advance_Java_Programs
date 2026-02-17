package Java8Features;
interface calc{
	void calculate(int num1, int num2);
}
public class LambdaExpressionPractice {
	public static void main(String[] args) {
		calc c = new calc() {
			@Override
			public void calculate(int num1, int num2) {
				System.out.println("Sum: " + (num1 + num2));
			}
		};
		c.calculate(12,78);
		calc c1 = (int num1, int num2) -> System.out.println("Sum : " + (num1 + num2));
		c1.calculate(12,23);
		calc c2 = (num1, num2) -> {
		System.out.println("Sum of two numbers : ");
		System.out.println(num1 + num2);
		};		
		c2.calculate(12, 12);
	}
}
