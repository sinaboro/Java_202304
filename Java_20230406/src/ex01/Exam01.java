package ex01;

import java.util.Scanner;

/*
 *  문제1
	키보드로 국어, 영어, 수학 점수를 입력 받아서
	총점/평균은 출력하는 프로그램 작성.
 */
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math,total;
		double average;  //실수값
		
		System.out.println("국어점수>>");
		kor = sc.nextInt();
		System.out.println("영어점수>>");
		eng = sc.nextInt();
		
		System.out.println("수학점수>>");
		math = sc.nextInt();
		
		total = kor+eng+math;
		average = total/3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.printf("평균 : %.2f\n", average);

	}

}
