package Java8Features;

class CheckVoter{
	void checkVoter(int checkAge) {
		if(checkAge >= 18) {
			System.out.println("Eligible to vote: ");
		}
		else {
			System.out.println("Not eligible to vote: ");
		}
	}
}
@FunctionalInterface
interface Voter{
	void checkAge(int age);
}
public class MethodReferencing {
public static void main(String[] args) {
	Voter v = age -> {
		if(age >= 18) {
			System.out.println("Yes, Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
	};
	
	v.checkVoter(20);
	CheckVoter cv = new CheckVoter();
	Voter vl = vl::CheckVoter;
	v1.checkVoter(17);
	
}
}
