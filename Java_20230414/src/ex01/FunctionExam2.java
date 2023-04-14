package ex01;

/*
 * 함수
 * 
 * String main(int num){
 * 	return "문자열";
 * }
 * 
 * void : 반환타입, main : 함수명, () : 매개변수 타입 
 * {} : 함수가 수행 문장
 * 
 * 2. 더하기 : 반환타입 X, 매개변수 O (2개)
 * 
 * 2. 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성.
 *  
 * 
 */
public class FunctionExam2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//  함수를 어떻게 전달?
		add(10,20);
		convertInt(10.9);
		System.out.println("프로그램 끝" + ", ") ;
	}

	static void add(int num1, int num2) {
		System.out.println("더하기 : " + (num1+num2));
	}
	
	static void convertInt(double f) {
		System.out.println((int)f);
	}
}




