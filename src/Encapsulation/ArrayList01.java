package Encapsulation;
import java.util.*;
/*
 Encapsulation -> declaring private variable and accessing them using
                  getter and setter method which have prefix get and set
 */
class Student{
	String name;
	String course;
	int id;
	public Student(String name, String course, int id) {
		super();
		this.name = name;
		this.course = course;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
public class ArrayList01 {

	public static void main(String[] args) {
		
    List<Student> StudentInfo = new ArrayList<Student>();  //UpCasting 
    /*Generic Class -> Generic Class is a class that operates on one or more type parameters, 
    allowing it to work with different data types while maintaining compile-time type safety.*/
    StudentInfo.add(new Student("Student1", "MCA", 1));
    StudentInfo.add(new Student("Student2", "MCA", 2));
    StudentInfo.add(new Student("Student3", "MCA", 3));
    StudentInfo.add(new Student("Student4", "MCA", 4));
    StudentInfo.add(new Student("Student5", "MCA", 5));
    StudentInfo.add(new Student("Student6", "MCA", 6));

    
    System.out.println("ID\tCourse\tName");
    for(Student s: StudentInfo) {
    	String result = String.format("%d\t%s\t%s", s.getId(), s.getCourse(), s.getName());
    System.out.println(result);
    }
	}
}
