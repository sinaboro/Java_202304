package ex02;

class Member{
	static int count;      //클래스변수,정적변수
	String name;
	String id;  //인스턴스변수...변수/멤버변수
	String password;
	int age;
	
	//인스턴스메소드 --> 클래스메소드, 정적메소드
	static void checkOut() {
		
	}
	//인스턴스메소드
	boolean login(String id, String pw) { //지역변수
		
		if(id.equals("홍길동") &&  pw.equals("12345"))
			return true;
		else return false;
	}
	
	//인스턴스메소드
	void logout(String id)  { //인스턴스메소드
		System.out.println(id + "님 로그아웃되었습니다.");
	}
}

public class MemberTest {

	static int test = 10;
	public static void main(String[] args) {
		
		int tmp = 10;
		int[] num = new int[5];
		
		Member[] mem = new Member[5];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
