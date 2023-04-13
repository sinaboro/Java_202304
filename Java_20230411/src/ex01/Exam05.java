package ex01;

/*

	+
   ++
  +++
 ++++
+++++

행 : 5
열 : 5

*/
public class Exam05 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { 
			for(int j=0;j<5; j++) {
				if(j<4-i)
					System.out.print(" ");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}

}

