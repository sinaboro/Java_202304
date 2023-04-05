package ch2;

public class varEx5 {

	public static void main(String[] args) {
		
		// 정수 + 정수 => 정수
		// 정수 + 실수 => 실수
		
		//문자열 + 정수 => 문자열
		//문자열 + 실수 => 문자열
		
		int num = 10;
		double d = 10.5;
		String s = "eng";
		
		double dd = num + d;
		
		System.out.println(num+d);
		System.out.println(s+d);   //"eng" + "10.5" = eng10.5
		System.out.println(s+d+num); //"eng" + "10.5" = eng10.5 + "10" => eng10.510
		System.out.println(s+(d+num)); //10.5+10 => 20.5 => "eng"+ "20.5"  => eng20.5
		
		System.out.println("" + 7+7 );  // ""+"7" => "7" + "7" => "77"
		
		System.out.println("aaaaaa");
		System.out.println("bbbbbb");
		System.out.println("-----------------");
		System.out.print("aaa\naaa ");  //개행문자
		System.out.print("bbbbbb\n");
		System.out.println("\n-----------------");
		
		int n = 15;
		System.out.printf("A : %d B: %d C: %d\n",10,20,30);
		//                 8   10  16진법
		System.out.printf("%o, %d, %x, %X\n",n, n, n,n);  //format : 형식
		
		double d2 = 10.52456;
		System.out.println(d2);
		System.out.printf("%.2f\n", d2);
		
		System.out.println("-----------------");
		int finger = 10;
		System.out.printf("finger : %d\n",finger);
		System.out.printf("finger : [%5d]\n",finger);
		
		System.out.printf("finger : [%-5d]\n",finger);
		
		
		
		
		
	}

}
