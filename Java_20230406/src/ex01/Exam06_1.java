package ex01;

import java.util.Scanner;

// 면접점수 >70, 실기 점수 >70 합격  아니면 불합격
public class Exam06_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/////////
		
		System.out.println("면접점수 입력>");
		int 면접점수  = sc.nextInt();
		
		if(면접점수 >=70) {
			System.out.println("합격입니다.");
			System.out.println("다음주 월요일부터 출근하세요.");
		}
		
		
		
		/////////
		System.out.println("프로그램 종료");

	}

}
