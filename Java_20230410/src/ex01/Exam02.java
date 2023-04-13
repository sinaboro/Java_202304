package ex01;

//1~ 100 홀수 갯수?
public class Exam02 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1; i<=100 ; i++) {
			if(i%2==1)
				count++;
		}
		System.out.println("1번째 => 1~100사이 홀수는: " + count);

		count=0;
		for(int i=1; i<=100 ; i += 2) //i= i+2
				count++;
		System.out.println("2번째 => 1~100사이 홀수는: " + count);
			
	}

}
