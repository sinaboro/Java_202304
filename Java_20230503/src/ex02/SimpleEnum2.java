package ex02;

enum Animal{
	PGI,DOG,CAT
}
enum Person2{
	MAN,WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		
		who(Animal.CAT);
		//who(Animal.CAT);
		
	}
	
	public static void who(Animal p) {
		switch(p) {
		case PGI :
			System.out.println("강아지");
			break;
		case DOG :
			System.out.println("고양이");
			break;
		default:
			System.out.println("돼지!!!!!!!");
				
		}
	}
	
	

}
