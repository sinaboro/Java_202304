package ex01;

//Tv 클래스 설계               예)  int num, int kor
class Tv {
	//멤버변수, 필드
	String color;
	boolean power;
	int channel;
	
	//메소드, 멤버함수
	void power( ) { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
	
	public Tv() {   //디폴트 생성자
	}
}

public class TvTest {

	public static void main(String[] args) {
		
		Tv tv  = new Tv();
		
		tv.color = "검정";
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.color);
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv();
		lgtv.color = "흰색";
		System.out.println(lgtv.color);
		System.out.println(lgtv.channel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
