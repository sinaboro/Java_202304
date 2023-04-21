package ex04;

class A{
	void funcA() {
		System.out.println("A func()");
	};
	
	public String toString() {
		return "A class";
	}
}
class B extends A{
	void funcB() {
		System.out.println("B func2()");
	};
	public String toString() {
		return "B class";
	}
}
class C extends A{}

public class Exam01 {

	static void action(A a) {
		
		if (a instanceof A) {
			A aa = a;
		}else if(a instanceof B) {
			B b = (B)a;
		}else if(a instanceof C) {
			C c = (C)a;
		}
	}
	public static void main(String[] args) {
		
	
		action(new A());  // A a = new A();
		action(new B());  // A a = new B();
		action(new C());  // A a = new C();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
