package ex07;

abstract class Player { // 추상클래스
	abstract void play(int pos);
	abstract void stop();
}


class Test extends Player {

	@Override
	void play(int pos) {
		System.out.println("--------------");
	}
	 
	void stop() {};
	
}

public class Exam01 {

	public static void main(String[] args) {
		Test t = new Test();
		
	}

}
