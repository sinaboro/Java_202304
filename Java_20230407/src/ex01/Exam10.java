package ex01;

import java.util.Scanner;

//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력1>>");
		int num = sc.nextInt();
		
		if(num>50)
			System.out.println("50이상");
		else
			System.out.println("50이하");

	//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		System.out.println("정수입력2>>");
		num = sc.nextInt();
		if(num % 3 ==0)
			System.out.println("3의 배수");
		else
			System.out.println("3의 배수 아니다.");
	}

}
