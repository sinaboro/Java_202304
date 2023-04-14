package ex01;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {
		
		int[] n = new int[5];
		
		int[][] num = new int[4][3];
		
		for(int i=0; i<num.length; i++)
			for(int j=0; j<num[i].length; j++)
				num[i][j] = (int)(Math.random()*100)+1;
		
		
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) 
				System.out.print(num[i][j] + ", ");
			
			System.out.println();
		}
		System.out.println("==========================");
		int[][]number = new int[5][5];
		int count=0;
		for(int i=0; i<number.length; i++)
			for(int j=0; j<number[i].length; j++)
				number[i][j] = ++count;

		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number[i].length; j++)
				System.out.printf("%2d, ", number[i][j]);
			System.out.println();
		}
		
		
		
		
	}

}












