package ex05;

interface MyFunction{
	int max(int a, int b);  //추상메소드
}

public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m = (a, b)->	a>b? a:b;
						
		System.out.println("max : " + m.max(10, 20));
	}

}
