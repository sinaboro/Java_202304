package ex01;

import java.util.ArrayList;
import java.util.Collections;

class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class ArrayList01 {

	public static void main(String[] args) {
		
//		int[] num = new int[5];
//		num[0] = 정수형;
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(30);
		list1.add(50);
		list1.add(40);
		list1.add(20);
		
		System.out.println("size : " + list1.size());
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
		System.out.println("--------------------");
		Collections.sort(list1);
		for(int i=0; i<list1.size(); i++)
			System.out.println(list1.get(i));
		
			
		
	}

}
