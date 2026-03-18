/*
 Runnable r = new Runnable(){
 public void run(){
 System.out.println("Running Thread");
 }
 }
 */

/*
 1. StringBuffer->
 
 2. StringBuilder->
 
 3. String-> 
 
 */

package Java8Features;
@FunctionalInterface
interface Square{
	int square(int n);
}
interface checkPalindrome{
	boolean palindrome(String info);
}
public class PracticeQuestion {
public static void main(String[] args) {
	
	//1. Runnable r1 = ()-> System.out.println("Runnable Thread");
	//2. Callable<Integer> c = ()-> 100;
	
	//3. Comparator<Integer> comp = (Integer a, Integer b) -> a - b;
	//4. ActionListner al = (ActionEvent e)-> System.out.println("Button Clicked");
	
	//5. 
	Square s = (int n)-> n*n;
	System.out.println(s.square(4));
	
	checkPalindrome cp = (String info)-> {
		                              String infoRev = new StringBuilder(info).reverse().toString();
		                              return infoRev.equals(info);
		                             
		                              
	                                 };
    checkPalindrome cp1 = (String info)-> new StringBuilder(info).reverse().toString().equals(info);
			                             
			                     
    }
}
 