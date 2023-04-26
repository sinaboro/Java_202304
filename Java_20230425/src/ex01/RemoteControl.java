package ex01;

//인터페이스 선언
public interface RemoteControl {
	//상수(public static final) 생략 가능
	public static final int MAX_VALUM = 10;
	int MIN_VALUM = 0;
	
	//추상메소드 --body없음.
	public void trunOn();
	public void trunOff();
	//public void setValume(int n);
	
	//디폴트메서드 -- 구현클래스에서 재정의 선택 가능
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음처리 합니다.");
		else
			System.out.println("무음처리 해제합니다.");
	}
	
	//정적메소드(public 생략 가능)
	public static void changeBattry() {
		System.out.println("건전지를 교체합니다.");
	}
}
