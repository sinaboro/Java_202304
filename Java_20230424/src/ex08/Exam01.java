package ex08;

interface Animal{
	void eat();
	public abstract void sleep();
	default void sound() {};
}

class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("고양이는 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("고양이는 잔다");
	}
	
	public void sound() {
		System.out.println("아홍~");
	}
}

class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("강아지는 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("강아지는 잔다.");
	}
	
}

public class Exam01 {

	public static void main(String[] args) {
		
//		Dog dog  = new Dog();
//		dog.eat();
//		dog.sleep();
		
		Animal an = new Dog();
		an.eat();
		an.sleep();
		
		an = new Cat();
		an.eat();
		an.sleep();

	}

}
