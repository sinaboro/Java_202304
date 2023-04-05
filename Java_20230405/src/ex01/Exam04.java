package ex01;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 초를 입력 >>");
		int num = sc.nextInt();
		
		int second = num % 60;  
		int hour  = num  / 3600; //60*60 
		int minute = (num % 3600) /60;
		
		System.out.println(hour + "시, " + minute + "분 , " + second + "초");
		*/
		  //ex1
	       Scanner sc = new Scanner(System.in);
	       System.out.println("입력");
	       
	       //초
	       int second = sc.nextInt();
	       System.out.print(second%60+"sec");
	       
	       //분
	       int minute = second/60;
	       
	       System.out.print(minute%60+"min");
	       
	       //시
	       int hour = minute/60;
	       System.out.print(hour+"hour");
		
	       System.out.println();
	       System.out.println(second/60);

	}

}
