package StreamAPI;
import java.util.stream.*;
import java.util.*;

public class StreamAPI01 {
public static void main(String[] args) {
	List<Integer> data = Arrays.asList(23, 43, 56, 75);
	System.out.println(data);
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(23);
	list.add(245);
	list.addAll(List.of(23, 234, 56, 12, 45));
	list.addAll(data);
	System.out.println(list);
	
	list.stream()
	.filter(n -> n > 25)
	.forEach(System.out :: print);
	
	System.out.println("\n");
	
	list.stream()
	.filter(n -> n > 25)
	.map(n -> n * 2)
	.forEach(System.out :: print);

	System.out.println("\n");

	System.out.println(list.stream()
	.filter((element) -> element > 89)
	.count());
	
	System.out.println("\n");
	
	list.stream()
	.filter(n -> n > 25 && n < 79)
	.forEach(System.out :: print);
	System.out.println("\n");

	List<Integer> l1 = list.stream().filter((n) -> n > 45).toList();
    System.out.println(l1);
    
    System.out.println("\n");
    
    List<Integer> list1 = Arrays.asList(10, 20, 39, 45, 24);
    Optional<Integer> result1 = list1.stream()
    		                       .filter(x -> x > 20)
    		                       .findFirst();
    if(result1.isPresent()) {
    	System.out.println("First element greater than 20: " + result1.get());  
    }
    else {
    	System.out.println("No element found");
    }
}
}
