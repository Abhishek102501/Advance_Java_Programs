package Java8Features;
interface Calc{
	int square(int num);

}
public class LambdaExpressionPractice02 {
	public static void main(String[] args) {
		Calc c = num -> num * num;
		
		int result = c.square(20);
		System.out.println("Square of number is: " + result);
		
	}
}
