package ex01;

import java.util.Scanner;

/*
 * 1.  몇 개의 숫자를 받을지 물어보는 코드를 작성하고,
	2. 숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하시오.
	3. 소수점이나 문자를 받으면 다시 쓰라고 해야 하며 일을 끝내야 함.
	
	정수만 5회 입력
	90,80,88, 66,55 ==>90+80+66 합을 구해서 출력
	
	정수만 5회 입력
	90, 66.7(x), 50,55, aa(x), 80 ,45
 */
public class Exam15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		System.out.println("몇회 입력>>");
        int number = sc.nextInt(); 
		
        while (count < number) {
			System.out.print("숫자를 입력하세요: ");
			if (sc.hasNextInt()) {
				int num = sc.nextInt();
				if (num % 2 == 0) {
					sum += num;
				}
				count++;
			}else if(sc.hasNextDouble()) {
				sc.next(); 
				System.out.println("실수는 입력 불가입니다. 다시 입력하세요.");
			}else {
				sc.next(); 
				System.out.println("문자는 입력 불가입니다. 다시 입력해주세요.");
			}
		}

		System.out.println("짝수의 합: " + sum);
	}
}
