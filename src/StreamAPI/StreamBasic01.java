package StreamAPI;
import java.util.*;
import java.util.List;
import java.util.stream.*;
public class StreamBasic01 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(5);
	list.add(10);
	list.addAll(List.of(23,345,66,77,34));
	System.out.println(list);
       List<Integer> result = 
			list.stream()
			    .sorted()
			    .filter(x -> x > 20)
			    .map(x -> x * 2)
			    .collect(Collectors.toList());
       
       System.out.println(result);
}
}
