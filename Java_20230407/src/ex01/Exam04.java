package ex01;

import java.util.Scanner;

/*
 * 숫자 하나 입력 받아서, 짝수 인지 홀수 인지 출력
 */
public class Exam04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>");
		int num = sc.nextInt();
		
//		if( num % 2 ==0)
//			System.out.println("2의 배수");
//		else
//			System.out.println("2의 배수 아님");
//		if( num % 2 == 1)
//			System.out.println("2의 배수 아님");
//		else
//			System.out.println("2의 배수");
		if( num % 2 != 0)
			System.out.println("2의 배수 아님");
		else
			System.out.println("2의 배수");
	
	}

}
