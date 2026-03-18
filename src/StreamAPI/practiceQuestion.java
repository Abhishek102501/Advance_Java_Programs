package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class practiceQuestion {
	public static void main(String[] args) {
		List<Integer> val = Arrays.asList(10, 23, 13, 15, 30, 45, 54);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(val);
		
		val.stream()
		           .filter((n) -> n % 15 == 0 && n % 2 == 0)
		           .forEach(System.out :: println);                     
	}
}
