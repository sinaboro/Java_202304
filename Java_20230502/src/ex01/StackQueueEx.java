package ex01;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedTransferQueue;

class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new ConcurrentLinkedDeque<>();
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
