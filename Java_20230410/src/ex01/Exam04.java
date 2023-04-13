package ex01;

import java.util.Scanner;

/*
 * sum>=1000000 큰 경우 i값 출력
 */
public class Exam04 {

	public static void main(String[] args) {
		
		int sum=0;
		int i=1;
		
		for( ; ; ) {
			if(sum >= 1000000) break;
			
			sum += i;
			System.out.println(sum);
		}
		
		System.out.println("i = " + i);
		
	}

}
