/*
 Lambda expression is a short form of declaring anonymous function,
  that reference is pass to the functional Interface object.
  
  Types->
  
  1. No parameter, No return type->
     a. ()->{} //multiple lines in function
     b. () -> System.out.println("Lambda Expression") //Single line representation
  2. No parameter, with return type->
     a. ()-> {
             //Write your lines here;
             return 10;
             } // Multiple lines
     b. ()-> 10 // return without return keyword     
 
  3. With parameter, no return type->
     a. With one parameter:
     (int num1)-> System.out.println(num1)
      (num1)-> System.out.println(num1)
      num1-> System.out.println(num1)
      num1-> {
             System.out.println("Multiple lines");
             System.out.println(num1)
             }
  4. With parameter, with return type->
    (int num1, int num2)-> num1 + num2
    (int num1, int num2)->{return num1 + num2}
 */

package Java8Features;

public class LambdaExpression {
	public static void main(String[] args) {
		
	}
}
