package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AsListCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		list.add("aaa");
		
		List<String> list2 = Arrays.asList("Toy","Box", "Robot", "Box");
		List<String> ls = new ArrayList<>(list2);
		ls.add("bbb");
		
		for(String str : ls)
			System.out.println(str);
		
		
		String[] str = new String[3];
		str[0] = "kor";
		str[1] = "eng";
		str[2] = "math";
		
		String[] str2 = {"kor","eng","math"};
	}

}
