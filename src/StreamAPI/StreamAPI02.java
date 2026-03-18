package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class StreamAPI02 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(23);
	list.add(245);
	list.addAll(List.of(23, 234, 56, 12, 45));
	System.out.println(list);
	list.stream()
	.forEach((element) -> System.out.print(element + " "));
	
	list.stream()
	.filter(n -> n > 60)
	.forEach((element) -> System.out.print(element + " "));
	
	list.stream()
	.forEach(System.out :: print);

	System.out.println("Count = " + list.stream().count());
	//Here we use indexing and hashing in count->
	System.out.println("Count = " + list.stream().filter((item) -> item >60).count());

}
}
