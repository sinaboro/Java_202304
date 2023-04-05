package ch2;

public class VarEx3 {

	public static void main(String[] args) {
		
		final double   PI = 3.14159;
		
		int korScore = 80;
		int engScore =  90;
		final int MATHSCORE = 80;
		
		System.out.println("총점 : " + (korScore +engScore + MATHSCORE ));
		
		korScore = korScore +10;
		engScore =  engScore + 10;
		
		char ch = 65;    //65, 'A'   ==> 0000 0000 0100 0001
		String ch2 = "Aaaaaaaaaa";
		System.out.println(ch);
	}

}
