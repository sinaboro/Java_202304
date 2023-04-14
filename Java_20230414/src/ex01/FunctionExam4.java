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
 * 3. 더하기 : 반환타입 X, 매개변수 x 
 * 
 * 3. 호출함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력
 *  
 * 
 */
public class FunctionExam4 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		add();
		
		System.out.println("프로그램 끝" + ", ") ;
	}
	
	static void add() {
		
		int num=10;
		int num2 = 20;
		System.out.println(num+num2);
	}
	
}




