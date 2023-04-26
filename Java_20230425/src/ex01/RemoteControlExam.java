package ex01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		RemoteControl rc = new Television();
		rc.trunOn();
		rc = new Audio();
		rc.trunOn();
		rc.setMute(true);
		
		Television tel = new Television();
		tel.search(null);
		
		Searchable se = new Television();
		se.search(null);
		
		
		System.out.println(RemoteControl.MAX_VALUM);
		RemoteControl.changeBattry();
	}
	
	void test() {}

}
