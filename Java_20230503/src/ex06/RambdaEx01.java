package ex06;

interface Aaa{
	int square(int x);
}

interface Bbb{
	void printVar(String name, int i);
}

interface Ccc{
	void func() ;
}

public class RambdaEx01 {

	public static void main(String[] args) {
		
		Ccc cc = () -> System.out.println("-----------------");
		cc.func();
		
		Aaa aa = x -> x*x;
		
		System.out.println(aa.square(10));
		
		Bbb bb = (name, i)-> System.out.println(name + "=" + i);
		
		bb.printVar("kim", 20);
		
	}

}
