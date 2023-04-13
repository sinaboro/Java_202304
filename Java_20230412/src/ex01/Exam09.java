package ex01;

import java.util.Arrays;

/*
 * 1. 배열10개 생성 후 랜덤으로 1~100 사이 값을 넣는다.
 * 2. 배열10개 총점과 평균을 구한다.
 * 3. 배열10개 최대값 , 최소값을 구한다.
 * 4. 배열10개 오름차순 정렬을 한다. 
 * 
 */
public class Exam09 {

	public static void main(String[] args) {
		final int NUM = 10;
	
		int[] arr = new int[NUM];
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("총점"+sum);
		System.out.println("평균"+sum/(double)arr.length);
		
//		최대값과 최소값 구하기
		
		int max=0, min = arr[0];
				
		for(int i = 1 ; i < arr.length; i++)
			if(arr[i] > max)
				max = arr[i];
		
		for(int i = 1 ; i < arr.length; i++)
			if(arr[i] < min)
				min = arr[i];
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
		
		String[] str = {"abc", "efg", "kor","eng","math"};
		char[] ch = {'a','b','c','d','e'};
		System.out.println();
		System.out.println(Arrays.toString(ch));
		System.out.println(ch);
		System.out.println(arr);
		System.out.println(Arrays.toString(str));
		System.out.println(str);
		
		
		
		
		
		
		
		
				
		
		
	}

}
