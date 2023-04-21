package ex01;

class A{
	int a;
	int c =100;
	A() {}
	A(int a, int c){
		this.a = a; this.c =c;
	}
	void func() {
		System.out.println("func()");
	}
}

class B extends A{
	int b;
	int c = 200;
	
	B(){
		super();
	}
	B(int a, int b){
		super(a,b);
	}
	void func2() {
		System.out.println("func()");
	}
}

class C extends A{
	int k;
	void func3() {
		System.out.println("func3()");
	}
}

class D extends B{
	int d;
	void func4() {
		System.out.println("func4()");
	}
	D(){
		super();
	}
}
public class Exam {

	public static void main(String[] args) {
		
		
		B b = new B(1,2);
		b.a = 10;
		b.b = 20;
		b.func();
		b.func2();
		System.out.println(b.c);
		
		System.out.println("---------------------");
		
		A a = new A();
		a.a = 1;
		a.c  =2;
		a.func();
		System.out.println("--------------------");
		
		C c = new C();
		System.out.println("--------------------");
		
		D d = new D();
		
		
		
		
	}

}
