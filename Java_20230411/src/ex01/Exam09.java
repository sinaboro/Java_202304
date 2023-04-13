package ex01;

/*
int 타입의 변수 num 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를
완성하라 만일 변수 num의 값이 12345라면  , ‘1+2+3+4+5’ 의 결과인 15를 출력
[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
*/

public class Exam09 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		
//		for(;;) {
//			for(;;) {
//				
//				break;
//			}
//			
//		}
		
		while(true) {
			sum +=i;
			i++;
			
			System.out.println("sum="+sum); 

			if(sum>1000000) break;
			
		}
		System.out.println("프로그램 종료"); 
	}
}

