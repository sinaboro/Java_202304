package ex02;

abstract class Animal{  //추상클래스
	
	abstract void makeSound() ;  //추상메소드
	
}

class Cat extends Animal{

	@Override  //어노테이션 
	//Override --> 상위클래스는 재정의 하겠다는 적극적 표현 
	void makeSound() {
	}
	
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("멍멍~멍멍~");
	}
}

class Pig extends Animal{
	void makeSound() {
		System.out.println("꿀꿀~꿀꿀~");
	}
}

class Rabbit extends Animal{
	void makeSound() {
		System.out.println("토끼~토끼~");
	}
}

class 호랑이 extends Animal{
	void makeSound() {
		System.out.println("어흥~어흥~");
	}
}
public class AnimalTest {

	//고양이-야옹, 강아지-멍멍, 돼지-꿀꿀....... 짓는 소리
	public static void main(String[] args) {
		Animal[] animals = {new Cat(), new Dog(), new Pig(), new Rabbit(),new 호랑이()};
		
		for(int i=0; i<animals.length; i++)
			animals[i].makeSound();
		
		for(Animal animal : animals)
			animal.makeSound();
		
		System.out.println("-----------------");
		
		Dog d = new Dog();
		d.makeSound();
		
	}

}
