package ex10;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc add = new Add();
		int result = add.calcuate(10, 10);
		System.out.println(result);
		
		Calc sub = new Sub();
		result = sub.calcuate(5, 10);
		System.out.println(result);
		System.out.println("-------익명 객체 ---------");
		
		Calc add1 = new Calc() {
			public int calcuate(int x, int y) {
				return x+y;
			}
		};
		result = add1.calcuate(5, 2);
		System.out.println(result);
		
		Calc mul = new Calc() {
			public int calcuate(int x, int y) {
				return x*y;
			}
		};
		result = mul.calcuate(2, 7);
		System.out.println(result);
		
		System.out.println(add1.calcuate(9, 10));
		System.out.println("-------람다식 ---------");
		
		Calc sub1 = (x,  y)-> 	x-y;
		result = sub1.calcuate(5, 2);
		System.out.println(result);

		Calc div = ( x,  y)-> 	x/y;
		result = div.calcuate(15, 3);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
	}

}
