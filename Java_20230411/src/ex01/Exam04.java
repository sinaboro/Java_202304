package ex01;

/*
구구단
*/
public class Exam04 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		
		//for(초기; 검사; 증가)
		while(i<10) {
			i++;
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("=====================");
		
		int k=2;
		int m=1;
		
		while(k<=9) {
			m = 1;
			while(m<=9) {
				System.out.printf("%d x %d =  %d\n",k,m,k*m);
				m++;
			}
			k++;
		}
		System.out.println("--------------------------------------");
		i = 5;
		while(i != 0) {
			i--;
			System.out.println(i + " - I can do it");
			
		}
		
	}

}

