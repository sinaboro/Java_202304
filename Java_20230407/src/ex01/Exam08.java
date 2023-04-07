package ex01;

import java.util.Scanner;

// 컴퓨터랑 가위가위보 게임.......
public class Exam08 {

	public static void main(String[] args) {
		
		int com = (int)(Math.random()*3)+1; //1~3  //0~9 정수  ==> 1 ~ 10
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1(가위),2(바위),3(보) 중 입력하세요>");
		int user = sc.nextInt();
		
		switch(user-com) {
		case 0 :
			System.out.println("비김");
			break;
		case -2:
		case 1 :
			System.out.println("User 승!");
			break;
		case -1:
		case 2:
			System.out.println("Com 승!");
			break;
		}
		System.out.println("User : " + user + ", Com : " + com);
	}

}
