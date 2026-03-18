package Switch;

public class SwitchExample {
public static void main(String[] args) {
	int day = 1;
	switch(day) {
	case 1: 
	System.out.println("Monday");
	break;
	case 2: 
		System.out.println("Tuesday");
		break;
	case 3: 
		System.out.println("Wednesday");
		break;
	case 4: 
		System.out.println("Thrusday");
		break;
	case 5: 
		System.out.println("Friday");
		break;
		default:
			System.out.println("No-day");
	}
	
	String result = switch(day) {
	case 1, 4, 5 ->{
		System.out.println("This is 1, 4 and 5");
		yield "Monday"; //To get out of switch 
	}
	case 2 -> "Tuesday";
	case 3 -> "Wednesday";
	default -> "No-day";
	};
	System.out.println(result);
}
}
