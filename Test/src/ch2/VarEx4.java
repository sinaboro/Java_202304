package ch2;

public class VarEx4 {

	public static void main(String[] args) {
		
//		double f = 0.1 + 0.1 + 0.1 +0.1 + 0.1 + 0.1 +0.1  + 0.1 + 0.1 +0.1;
		float f = 0.1f + 0.1f + 0.1f +0.1f + 0.1f + 0.1f +0.1f  + 0.1f + 0.1f +0.1f;
		
		System.out.println(f);
		
		double sum=0;
		
		for(int i=0; i<30; i++)
			sum = sum + 0.1;
		
		System.out.println(sum);
		
		float f1 = 2147483648.0f;
		float f2 = 2147483658.0f;
		float f3 = 2147483768.0f;
		
		System.out.printf("%f\n",f1);
		System.out.printf("%f\n",f2);
		System.out.printf("%f\n",f3);
		
		final int MAX_SPEED =100;
		
		float ff = 0.1f;
		
		double df =  0.1f;
		
		int sum2 = -2147483648-1;
		System.out.println(sum2);
		
		char ch2 = 'B';
		
		String str = "korea";   //문자열

	}

}
