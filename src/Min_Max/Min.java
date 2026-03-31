package Min_Max;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
public class Min {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(12, 1, 4, 100, 200, 150, 45, 67, 99);
	List<Integer> sortedListAsc = list.stream().sorted((a, b) -> a - b).toList();
	List<Integer> sortedListDsc = list.stream().sorted((a, b) -> b - a).toList();

	System.out.println(list);
	System.out.println(sortedListAsc);
	System.out.println(sortedListDsc);

	Optional<Integer> result = list.stream().max((a, b) -> b - a);
	Optional<Integer> result1 = sortedListAsc.stream().max((a, b) -> b - a);
	Optional<Integer> result2 = sortedListDsc.stream().max((a, b) -> b - a);


	result.ifPresent(System.out::println);
	result1.ifPresent(System.out::println);
	
	

}
}
