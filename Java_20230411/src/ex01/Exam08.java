package ex01;

/*
break, continue
*/

public class Exam08 {
	public static void main(String[] args) {
		
		int num = 12345;  // 1 + 2+ 3+ 4+5=>15
		int sum = 0;
		
		while(num>0) {
			sum +=  num % 10;       //5
			num = num /10;  //1234
		}

		System.out.println("sum="+sum); //15
		

	}
}

