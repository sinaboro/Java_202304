package ex01;

import java.util.Scanner;

/*
	램덤함수1~100사이 숫자를 같지고 있다.
	유저가 컴퓨터 숫자를 맞추는 게임..
*/

public class Exam12 {
	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100)+1; //1~100
		int count=0;
		Scanner sc = new Scanner(System.in);
		int user=0;
		//
		while(true) {
			System.out.println("정수 입력 > ");
			user = sc.nextInt();
			count++;
			if(com == user) {
				System.out.println("정답입니다.");
				break;
			}else if(com>user) 
				System.out.println("com은 큰 수 입니다.");
			else if(com<user)
				System.out.println("com은 작은 수 입니다.");
		}
		//
		System.out.println(count+"회 맞춤");
		System.out.println("com : "+ com + ", user : " + user); 
	}
}

