/*Record class is used->
 [A record is a special type of class introduced in Java 16
  to create immutable data carrier classes.]
->Record components are automatically:
1.private
2.final

->Records are implicitly final classes (cannot extend them).
They generate:
1. constructor
2. accessor methods
3. equals()
4. hashCode()
5. toString()
//
//->Used for DTOs, API responses, immutable data models.
//*/
//package Encapsulation;
//record Student1(int Sid, String name, String course) {};
//	
//public class EncExample {
//public static void main(String[] args) {
//	
//	Student s = new Student1(1, "Samar", "MCA");
////	System.out.println(s.Sid());
////	System.out.println(s.name());
////	System.out.println(s.course());
////	System.out.println(s);
//}
//}
