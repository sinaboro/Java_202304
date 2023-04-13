package ex01;

/*
숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 
출력하는 코드를 완성하라 만일 문자열이 "12345" 라면  ‘1+2+3+4+5’ 결과인 15를 출력이 출력이
어야 한다 [Hint] String charAt(int i) 클래스의 을 사용
*/

public class Exam07 {
	public static void main(String[] args) {
		
		String str = "6755555";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			
			char tmp = str.charAt(i);
			int num = tmp-'0'; 
			sum += num;			//sum(1)+2 = >3+3=>6+4=>10+5=>15
//			sum += str.charAt(i)-'0';
		}
		System.out.println("sum="+sum);
	}
}

