package ex01;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		ArrayList<Integer> lists = new ArrayList();
		
		lists.add(10);
		lists.add(20);
		lists.add(30);

//		int num = lists.peek();
//		int num = lists.poll();
		int num = lists.remove(0);
		
		System.out.println(num);
		System.out.println(lists);
	}

}
