package Polymorphism;

class Animal{
	String name;
	String sound;
	
	Animal(){
		this(" ", " ");
	}
	void getInfo() {
		// TODO Auto-generated method stub
	}
	Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	void getInfo(String name, String sound) {
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
	}
	void getInfo(String name, String sound, int legs) {
		System.out.println("Name: " + name);
		System.out.println("Sound: " + sound);
		System.out.println("Legs: " + legs);

	}
}
class Cat extends Animal{
	Cat(String name, String sound){
		super(name, sound); //implicitly calls the constructor of super class
//		this.name = name;
//		this.sound = sound;
	}
	@Override
	void getInfo(){
		System.out.println("CatName: " + name);
		System.out.println("CatSound: " + sound);
	}
	void getInfo(String name, String sound){
		System.out.println("CatName: " + name);
		System.out.println("CatSound: " + sound);
	}
}
public class Example1 {
	public static void main(String[] args) {
//	Animal an = new Animal("Horse", "Hingggg");
//	an.getInfo(0);
//	an.getInfo("cat", "Meow", 4);
//	an.getInfo("Lion", "Roar");
	Cat c1 = new Cat("Cat2", "Meow");
	c1.getInfo();
	Animal c2 = new Cat("Cat2", "Meow"); //UpCasting
	c2.getInfo();
	}
}
