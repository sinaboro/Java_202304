package ex01;

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

public class Exam01 {

	public static void main(String[] args) {
		
		
		//B b = new A(); //차후 설명
		
		A aa = new B();   
		aa.funcA();
		System.out.println(aa.toString()); //Object toString() 출력 : 오바라이드 하기전
		A a = new A();
		
		B b = new B();
		
		Object o = new B();  
		System.out.println(o.toString());
	
		//대전체 : 하위클래스가 상위클래스 참조 불가
		A aaa=  new B();
		
		B bbb = (B)aaa;
		
//		bbb.
		
		
		
		
		
		
		
	}
}
