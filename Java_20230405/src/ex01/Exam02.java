package ex01;

public class Exam02 {

	public static void main(String[] args) {
		//형변환..
		// byte<short<int<long   < float<double
		// ==> 자동형변환
		// 연산이나 대입할 때 타입이 일치하지 않으면 실행이 안된다.
		// 따라서 먼저 타입을 일치 시킨다. 타입을 일치시킬 때 형변환이 발생한다.
		double d = 85.4;
		int score = 10;
		
		d = score;
	//	d = (double)score;
		System.out.println(d);
		d = 85.4;
		
		score = (int)d;
		System.out.println(score);
		
		short sh = 32767;
		int num  = 50000;
		sh = (short)num;
		System.out.println(sh);
		
		System.out.println( (double)5 / 2 );
	
		System.out.println( 5&2);
		System.out.println( 5|2);
		
		
	}

}
