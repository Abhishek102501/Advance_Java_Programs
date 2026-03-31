package Min_Max;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
public class PracticeQuestion {
public static void main(String[] args) {
//	List<Integer> list = Arrays.asList(12, 1, 4, 100, 200, 150, 45, 67, 99);
//	System.out.println(list);
//	
//	Optional<Integer> result = list.stream().min((a, b) -> a- b);
//	result.ifPresent(System.out::println());
	
//6
//	ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(12, 5, 20, 8, 30, 5 ,8));
////	 int max = list6.stream().
//	ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 50, 50, 30, 80, 20, 90));
//	Optional<Integer> result = list.stream() 
//			                       .distinct()
//			                       .max((a, b) -> a - b);
//	result.ifPresent(System.out :: println);
//	
//	ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 50, 50, 30, 80, 20, 90));
//	Optional<Integer> result1 = list1.stream().max((a, b) -> a - b);
//	result1.ifPresent(System.out :: println);

	ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Abhishek", "Abhi", "Shyam", "Ram"));
	Optional<String> result2 = list2.stream().min((a, b) -> a.length() - b.length());
	result2.ifPresent(System.out::println);
	
	ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Abhishek", "Abhi", "Shyam", "Ram", "Ram"));
	Optional<String> result3 = list3.stream().max((a, b) -> a.length() - b.length());
	result3.ifPresent(System.out::println);
			                         
	
	
	
			               
			               
		
	
}
}
