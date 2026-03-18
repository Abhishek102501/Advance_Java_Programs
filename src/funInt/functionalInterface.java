
/*
 // Anonymous Class -> 
     Add a = new Add() {

		@Override
		public int calculate(int n1, int n2) {
			// TODO Auto-generated method stub
			return n1 + n2;
		}};
		System.out.println("Sum : " + a.calculate(23, 4));
		
 //Lambda Expression -> 
		Add a1 = (int n1, int n2) -> (n1 + n2);
		System.out.println("Sum : " + a1.calculate(23,34));
		
		only one method is declared in Interface so that it get's easy to use Lambda Expression
 */

package funInt;
@FunctionalInterface
interface Add{
	int calculate(int n1, int n2);
	
//	default void calculate(int n1, int n2, int n3) {	
//	}
//	static void calculate(int n1) {	
//	}
//	private void calculate() {
//	}
	
}

public class functionalInterface {
	public static void main(String[] args) {
		// Anonymous Class ->
     Add a = new Add() {

		@Override
		public int calculate(int n1, int n2) {
			return n1 + n2;
		}};
		System.out.println("Sum : " + a.calculate(23, 34));
		
		//Lambda Expression -> 
		
		Add a1 = (int n1, int n2) -> (n1 + n2);
		System.out.println("Sum : " + a1.calculate(23,34));
		
		//Lambda Expression  with multiple line->
		
		Add a2 = (int n1, int n2) ->{ 
			return n1 + n2;
				};
		System.out.println("Sum : " + a1.calculate(23,34));
	}
}

