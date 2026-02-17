package Abstraction;

class Student{
	private String name;
	private String course;
	private int s_id;
	public Student(String name, String course, int s_id) {
		super(); // to get the methods of object class implicitly
		this.name = name;
		this.course = course;
		this.s_id = s_id;
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
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	
	
}
public class Abstraction01 {
public static void main(String[] args) {
	Student s1 = new Student("Student1", "MCA", 1);
	System.out.println("Course = "+ s1.getCourse());
	System.out.println("Name = " + s1.getName());
	System.out.println("Id = " + s1.getS_id());
}
}
