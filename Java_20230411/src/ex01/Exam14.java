package ex01;

import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		
		int sum=0;
		int i=100;
	
		//for(초기; i<=10; 증가)
		//while(i<=10)
		do {
			sum += i;
			i++;
		}while(i<=10);
		
		System.out.println(sum);
	}
}

