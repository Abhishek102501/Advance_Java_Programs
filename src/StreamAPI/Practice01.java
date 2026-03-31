package StreamAPI;
import java.util.*;
import java.util.stream.*;
class Employee{
	String name;
	Employee(String name){
		this.name = name;
	}
}
class Student {
    String name;
    Student(String name) { this.name = name; }
}

class StudentDTO {
    String name;
    StudentDTO(String name) { this.name = name; }
}
public class Practice01 {
public static void main(String[] args) {
	
//    List<String> names = Arrays.asList("ankit", "rahul", "amit");
//    List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
//    System.out.println(result);
	
//	List<Integer> list = Arrays.asList(1, 2, 3, 4);
//	List<Integer> result = list.stream()
//			                          .map(x -> x *x)
//			                          .collect(Collectors.toList());
//	System.out.println(result);
	
//	List<String> list = Arrays.asList("Java", "Python", "C");
//	List<Character> result = list.stream().map(s -> s.charAt(0)).collect(Collectors.toList());
//	System.out.println(result);
	
//	List<Integer> list = Arrays.asList(10, 20, 30);
//	List<String> result = list.stream()
//			              .map(s->s.toString()).collect(Collectors.toList());
//	
//	System.out.println(result);
	
//	List<String> list = Arrays.asList("A", "B", "C");
//	List<String> result = list.stream().map(s -> "Item-" + s).collect(Collectors.toList());
//	System.out.println(result);
//	
//	List<String> list = Arrays.asList("Java", "Stream", "API");
//	List<Integer> result = list.stream()
//			              .map(s->s.length()).collect(Collectors.toList());
//	
//	System.out.println(result);	
//	List<Employee> list = Arrays.asList(new Employee("Amit"),
//			                            new Employee("Rahul")
//			                            );
//	List<String> result = list.stream().map(emp->emp.name)
//			                            .collect(Collectors.toList());
//	System.out.println(result);
	
//	List<Integer> list = Arrays.asList(5, 10, 15);
//			List<Integer> result = list.stream().map(x ->  x * 2).collect(Collectors.toList());
//	System.out.println(result);
//	
//	List<String> list = Arrays.asList(" Java ", " Python ", " C++ ");
//	List<String> result = list.stream()
//			              .map(x -> x.trim()).collect(Collectors.toList());
//	System.out.println(result);
	
//	List<Double> list = Arrays.asList(0.0, 20.0, 30.0);
//	List<Double> result = list.stream()
//			                   .map(x -> 9/5*x + 32).collect(Collectors.toList());
//	System.out.println(result);
	
//    List<String> list = Arrays.asList("Java", "API");
//    List<Integer> result = list.stream()
//    		                  .map(x -> x.hashCode()).collect(Collectors.toList());
//    System.out.println(result);
	
//	List<String> list = Arrays.asList("Java", "API");
//	List<String> result = list.stream()
//			                   .map(x-> x +"-" +x.length()).collect(Collectors.toList());
//    System.out.println(result);
	
//	List<Integer> list = Arrays.asList(1, 2, 3, 4);
//	List<Boolean> result = list.stream()
//			              .map(x -> x%2 == 0).collect(Collectors.toList());
//	System.out.println(result);
	
	List<Student> list = Arrays.asList(
		    new Student("Ankit"),
		    new Student("Amit")
		);

	List<StudentDTO> result = list.stream()
		    .map(s -> new StudentDTO(s.name))
		    .collect(Collectors.toList());

		System.out.println(result.size());


    
}
}
