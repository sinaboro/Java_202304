package ex01;

import java.util.Scanner;

//정수하나 입력받아서 1-4, 1학년, 2학년, 3학년, 4학년
public class Exam07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학년 입력>");
		
		int grade = sc.nextInt();
		final int ONE = 1;
		final int TWO = 2;
		
		switch(grade) {
		case ONE:
			System.out.println("1학년");
			break;
		case 2:
			System.out.println("2학년");
			break;
		case 3:
			System.out.println("3학년");
			break;
		case 4:
			System.out.println("4학년");
			break;
		default :
			System.out.println("1-4만 입력.....");
		}
		
		
		System.out.println("프로그램 종료");
	}
}
