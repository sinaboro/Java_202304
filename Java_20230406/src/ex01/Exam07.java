package ex01;

import java.util.Scanner;

// 성별, 나이 ===> 성별 : 남, 나이:20이상이면 군대 간다........ 아니면 안간다
public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 >");
		int 나이  =  sc.nextInt();

		sc.nextLine(); //엔터 제거 기능
		System.out.println("성별 입력 >");
		String 성별 = sc.nextLine(); 


		
		if(성별.equals("남") ) { //성별 == "남"  //문자열비교는 == 아니고, equals
			if(나이 >= 22)
				System.out.println("잘가");
			else
				System.out.println("군대 안감");
		}else 
			System.out.println("군대 안감");
		
		
		System.out.println("프로그램 종료");

	}

}
