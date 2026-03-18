package java_10;
/*
Java-10->

Local type variable inference->

1. Here, the compiler decides the type based on the right-hand side.
2. Must be initialized
3. Works only for local variables
4. Cannot assign null alone
*/
public class MainVar {
public static void main(String[] args) {
	int a = 10;
	var b = 20;
	var college = "Kiet MCA";
	var value = 10.10;
    var c = 23.3;
    c = 34;
    String name = new String("This is a String");
    var name1 = new String("This is a String with var");
    
    int[] arr = {2, 34, 56, 34};
    for(var n: arr) {
    	System.out.println(n);
    }
	//	Here, the compiler decides the type based on the right-hand side.
}
}
