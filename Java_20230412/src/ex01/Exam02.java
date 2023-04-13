package ex01;


/*
 * 조원3명 자바점수를 입력받아서 
 * 자바점수 배점은 랜덤함수이용해서 50~100값이 저장되도록 한다.
 * 조원 총점. 평균을 출력한다.
 */
public class Exam02 {

	public static void main(String[] args) {

		int sum =0;
		double avg =0;
		
		int[] 조4 = new int[30];
		
		for(int i=0; i<조4.length; i++) {
			조4[i] = (int)(Math.random()*50+1) + 50 ;
		}
		
		for(int i=0; i<조4.length; i++)
			sum += 조4[i];
		avg = sum/3.0;

		for(int i=0; i<조4.length; i++)
			System.out.print( 조4[i] + ", " );
		
		System.out.println();
		System.out.println(sum + ", " + avg);
		
	}

}
