package ex01;

public class Exam01 {

	public static void main(String[] args) {
		
		boolean power = false; // true, false
		
		if(power)  //()안 내용이 참이면 10줄 실행, ()안 내용이 거짓이면 12줄 실행
			System.out.println("power는 true");
		else
			System.out.println("power는 false");

		if( 5>20 )  //()안 내용이 참이면 15줄 실행, ()안 내용이 거짓이면 17줄 실행
			System.out.println("power는 5>2");
		else
			System.out.println("power는 5>20");
	}

}
