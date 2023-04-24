package ex05;

import java.util.Calendar;
import java.util.Date;


class Sample{
	public Sample() {}
	
	final private void test() {
		System.out.println("test()");
	}
}

class Singleton{
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstancec() {
		
		if(instance  == null)
			instance  = new Singleton();
		
		return instance;
	}
}

public class SingleTonTests {

	public static void main(String[] args) {
		//Singleton sing1 = new Singleton();  //에러 이유 설명? 
		
		Singleton sing1 = Singleton.getInstancec();
		Singleton sing2 = Singleton.getInstancec();
		System.out.println(sing1 == sing2);
		System.out.println("-------------------");
		
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		//s1.test();
		System.out.println(s1 == s2);
		System.out.println("--------------------");
		
		Calendar now = Calendar.getInstance();
		System.out.println(Calendar.getInstance().getTime());
		
	}

}
