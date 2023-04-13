package ex01;

import java.util.Scanner;

/*
 */
public class Exam06 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=0; i<=100; i++) //1~100회전
			sum += i;              //i값을 계속 sum누적
		
		System.out.println(sum); //for 벗어나면 실행
	}

}
