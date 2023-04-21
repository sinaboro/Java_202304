package ex02;

class Unit {
	int x, y; // 현재 위치
	void move(int x, int y) {}
	void stop() {/* */ }
}
class Marine extends Unit{ // 보병
	void stimPack() {}
	void move(int x, int y) {
		System.out.println("걸어서 이동");
	}
}

class 비행기 extends Unit{
	void move(int x, int y) {
		System.out.println("날아서 이동");
	}
}
class Tank extends Unit{ // 탱크
	void changeMode() {}
	void move(int x, int y) {
		System.out.println("탱크로 이동");
	}
}

class Dropship extends Unit{ // 수송선
	void load() {  } 
	void unload() { } 
	void move(int x, int y) {
		System.out.println("배로 이동");
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Dropship dr = new Dropship();
		move(dr);
		Marine mr = new Marine();
		move(mr);
		Tank ta = new Tank();
		move(ta);
		
		비행기 비 = new 비행기();
		move(비);
	}
	
	static void move(Unit u) {
		u.move(10, 10);
	}

}
