package ex01;


/*
 * 조원3명 자바점수를 입력받아서 
 * 자바점수 배점은 랜덤함수이용해서 50~100값이 저장되도록 한다.
 * 조원 총점. 평균을 출력한다.
 */
public class Exam03 {

	public static void main(String[] args) {

		int sum =0;
		
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int[] arrNum = {10,20,30};

		for(int i=0; i<3; i++)
			sum += arrNum[i];
		System.out.println(sum);
		
		
	}

}
