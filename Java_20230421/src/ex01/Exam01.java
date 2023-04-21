package ex01;

class B {
	static void f1() { System.out.println("f1()");};
}
class K extends B{
	static void f2() { System.out.println("f2()");};
}
class C extends B{
	static void f3() { System.out.println("f3()");};
}
class E extends B{
	static void f4() { System.out.println("f4()");};
}

public class Exam01 {

	public static void main(String[] args) {
		func(new B());
		func(new K());
		func(new C());
		func(new E());
	}
	
	static void func(B b) {
		
		if( b instanceof B) { //b가 B객체를 참조하거나 B를 상속하고 있는 객체이면 true
			b.f1();
		}else if ( b instanceof K) {//b가 C객체를 참조하거나 C를 상속하고 있는 객체이면 true
			K kk = (K)b; 
			kk.f2();
		}else if(b instanceof C) {
			C cc = (C)b; 
			cc.f3(); 
		}else if(b instanceof E) {
			E ee = (E)b; 
			ee.f4();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
