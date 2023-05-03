package ex01;

class Card{
	public void info() {
		System.out.println("card()");
	}
}

public class Exam01 {

	public static void main(String[] args) throws ClassNotFoundException {
//		Card card  = new Card();
//		card.info();
		
//		Class cObj = new Card().getClass();
//		Class cObj = Card.class;
//		Class cObj = Class.forName("ex01.Card");
//		Object obj = Class.forName("ex01.Card");
		
		String str = "kor";
		System.out.println(str);
		
		str = "koreakor";
		System.out.println(str);
		
		System.out.println("abc".compareTo("AAA"));
		String msg = str.replace("kor", "eng");
		System.out.println(str);
		System.out.println(msg);
		
		String study = "kor,eng,math";
		String[] aaa = study.split(",");
		for(String a : aaa)
			System.out.println(a);
		String s = "10";
		
		Object obj = Integer.parseInt(s);
		
		Object obj2 = Integer.valueOf(s);
		
		
		
		int i= 5;
		
		Integer iObj = new Integer(7);
		
		int sum =  i +   iObj;
		System.out.println(sum);
		
	}

}
