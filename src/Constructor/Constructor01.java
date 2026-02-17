package Constructor;

class Student{
	String name;
	int id;
	
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	void getInfo() {
		System.out.println("Name: " + name + " Id: " + id);
	}
	
}
public class Constructor01 {
	public static void main(String[] args) {
		Student s1 = new Student("Abhishek", 2);
		s1.name= "Alice";
		Student s2 = s1; 
		s2.name = "Bob";
		System.out.println(s2.name);
		s1.getInfo();
	}
}
