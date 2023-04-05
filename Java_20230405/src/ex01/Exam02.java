package ex01;

public class Exam02 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score = 10;
		
		d = score;
	//	d = (double)score;
		System.out.println(d);
		d = 85.4;
		
		score = (int)d;
		System.out.println(score);
		
		short sh = 32767;
		int num  = 10000;
		sh = (short)num;
		System.out.println(sh);
		
		System.out.println( (double)5/2 );
	
		System.out.println( 5&2);
		System.out.println( 5|2);
		
		
	}

}
