package ex05;

class Member{
	static String name;
	static int age;
	
	{
		name="홍길동";
		age  =20;
	}
	
	void display() {
		System.out.println(name + ", " + age);
	};
	
}

public class Exam01 {

	public static void main(String[] args) {
		
		Member m = new Member();
		m.display();

		Member m2 = new Member();
		m2.display();
		
		
	}

}
