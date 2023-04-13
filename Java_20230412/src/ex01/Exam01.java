package ex01;


/*
 * 조원3명 자바점수를 입력받아서 
 * 자바점수 배점은 랜덤함수이용해서 50~100값이 저장되도록 한다.
 * 조원 총점. 평균을 출력한다.
 */
public class Exam01 {

	public static void main(String[] args) {

		int 구본우, 추명선,정혜민,sum ;
		구본우 = 추명선 = 정혜민 = sum = 0;
		double avg =0;
		//50~100
		구본우 = (int)(Math.random()*50+1) + 50 ;
		추명선 = (int)(Math.random()*50+1) + 50 ;
		정혜민 = (int)(Math.random()*50+1) + 50 ;
		
		sum = 구본우 + 추명선 + 정혜민;
		avg = sum/3.0;
		
		System.out.println( 구본우 + "," + 추명선  + "," +정혜민 );
		System.out.println(sum + ", " + avg);
		
	}

}
