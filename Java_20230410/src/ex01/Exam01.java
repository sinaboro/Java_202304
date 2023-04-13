package ex01;

//1~ 10합 누적
public class Exam01 {

	public static void main(String[] args) {
		
		int count=0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 ==0 && i % 3 ==0) {
				System.out.print(i + ", ");
				count++;
			}
		}
		
		System.out.println("\n1~100에서 2와 3의 배수 갯수는 : " + count);
	}

}
