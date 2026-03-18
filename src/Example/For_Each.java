package Example;

import java.util.Arrays;
import java.util.List;

public class For_Each {
public static void main(String[] args) {
	int[] data = new int[]{1, 2, 4, 5, 6};
	List<int[]> list = Arrays.asList(data);
	System.out.println(list.get(0)[0]);
	
	int[] data1 = new int[] {1, 2, 3, 4, 5, 6};
	List<Integer> listData = Arrays.stream(data1).boxed().toList();
	System.out.println(listData);
	
	int[] data2 = new int[] {1, 2, 3, 4, 5, 6};
	List<Integer> listData1 = Arrays.stream(data2).boxed().toList();
	listData1.forEach(System.out::println);
	
	String[] data3 = new String[] {"Hello", "Everyone"};
	List<String> listData3 = Arrays.stream(data3).toList();
	System.out.println(listData3);
//    listD ata3.forEach(System.out::println);
}
}
