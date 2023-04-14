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
 * 1. 더하기 : 반환타입 O, 매개변수 O (2개)
 * 
 * 2. 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수작성.
 *  
 * 
 */
public class FunctionExam01 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int num = add(10,20);
		int number = convertInt(10.2);
		System.out.println("프로그램 끝" + ", " + num + "," + number) ;
	}

	static int convertInt(double f) {
		int result  = (int)f;
		return result;
	}
	
	static int add(int n1, int n2){
		System.out.println("add함수 시작....");
		int result = n1 + n2;
		return result;
	}
}




