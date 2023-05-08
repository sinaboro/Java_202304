package ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String st = it.next();
			System.out.println(st);
		}
		System.out.println("------------------");
		
		
		//Box만 삭제하고 싶네..
		it = list.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("Box"))
				it.remove();
		}

		System.out.println("------------------");
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
