package ex01;

public class OperatorEx2 {

	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;
		System.out.println(i + ", " + j);  // 6, 5
		 
		i=5;
		j=0;
		j = ++i;
		System.out.println(i + ", " + j);  //6, 6
 		
	}

}
