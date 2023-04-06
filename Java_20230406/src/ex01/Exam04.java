package ex01;

import java.util.Scanner;

//성적 입력 받아서 70이상 합격했습니다..메시지 출력..
public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jumsu = sc.nextInt();
		
		//조건문 ~ if
		if(jumsu >= 70) 
			System.out.println("당신은 합격했습니다.");
		
		if(jumsu < 70)
			System.out.println("당신은 불합격 입니다.");
		
		System.out.println("프로그램 종료");

	}

}
