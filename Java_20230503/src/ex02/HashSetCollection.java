package ex02;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet();  //중복x, 순서x
		
		set.add(15);
		set.add(2);
		set.add(8);
		set.add(90);
		set.add(2);
		set.add(10);
		
		for(int s : set)
			System.out.println(s);
		
		
		
	}

}
