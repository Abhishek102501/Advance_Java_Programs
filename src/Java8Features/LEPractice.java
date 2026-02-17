package Java8Features;
interface Election{
boolean age(int num);	
}
public class LEPractice {
public static void main(String[] args) {
	Election e = (int num) -> {
		return (num >= 18);
	};
	if(e.age(22)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
