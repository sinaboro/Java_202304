package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyFristStream2 {

	public static void main(String[] args) {
		int[] ar = {1,2,2,3,4,4,5,5,6};  //배열  
		
		//배열의 짝수합을 구함..단 중복제거
		
		IntStream stm1 = Arrays.stream(ar); //배열 ar로부터 스트림 생성
		           //     중복제거       짝수             최종연삭
		int total = stm1.distinct().filter(n-> n %2==0).sum();
		System.out.println("total : " + total);
		
	    
		//배열에서 중복제거후 홀수 갯수는 몇개인가?
		stm1 = Arrays.stream(ar);
		long count = stm1.distinct().filter(n->n%2==1).count();
		System.out.println("홀수 갯수 : " + count);
		
		
		String[] names = {"kim","park","hong","lee","kor","eng","math"};
		
		//1. 이름출력
		Stream<String> stm2 = Arrays.stream(names);
		stm2.forEach(str->System.out.println(str));

		System.out.println("-----------------");
		//2. 첫글자가 k만 출력
		stm2 = Arrays.stream(names);
		stm2.filter(name->name.startsWith("k"))
			.forEach(str->System.out.println(str));
		
		System.out.println("-----------------");
		//글자수가 4자 이상만 출력..
		stm2 = Arrays.stream(names);
		stm2.filter(n->n.length()>=4).forEach(n->System.out.println(n));
		
		System.out.println("-----------------");
		
		List<String> list = Arrays.asList("Toy", "Box", "Robot");
		
		//1. 리스트를 스트림으로 변환 후 출력
		Stream<String> s = list.stream();
		s.sorted().forEach(n->System.out.println(n));
		
		//2. 리스트를 스트림으로 변환후 글자 갯수합을 출력
		System.out.println("-----------------");
		//System.out.println( apply​("korea") );
		s = list.stream();
		long count2 = s.map(n->n.length()).count();
		System.out.println("글자수 : "+ count2);
		
		System.out.println("-----------------");
		s = list.stream();
	    int sum2	= s.mapToInt(n->n.length()).sum();
		System.out.println("글자수합 : "+ sum2);
		
		
		boolean t = test(11);
		//System.out.println(t);
	}

	static int apply​(String s) {
		return s.length();
	}
	
	static boolean test(int n) {
		return n %2 ==0;
	}
	
	static void accept(String str) {
		System.out.println(str);
	}
	
	
}
