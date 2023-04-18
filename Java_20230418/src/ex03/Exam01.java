package ex03;

class Member{
	private String name;
	private int age;
	
	//디폴드 생성자는 자바가 직접 생성한다. 
	//단만, 개발자가 생성자를 생성하지 않는 경우에만 만들어준다.
	//생성자==> 반환타입x, 클래스이름과 같다. 오버로딩이 가능하다. 초기화 기능을 가지고있다.
	public Member(String n, int a) {
		name = n;
		age = a;
	}
	public Member() {
		name = "미정의";
		age = 1;
	}
	Member(String n){
		name = n;
		age = 1;
	}
	
	void display() {
		System.out.println(name + ", " + age);
	}
	
	void setData(String n, int a) {
		name = n;
		if(a>=0 && a<=120)
			age = a;
		else
			age = 1;
	}
}

public class Exam01 {

	public static void main(String[] args) {
		Member s1 = new Member("구본우", 26);
	   
//		s1.name = "구본우";
//		s1.age  = 26;
		
		Member s2 = new Member("추명선", 26);
//		s2.name = "추명선";
//		s2.age = 26;
	
		s1.display();
		s2.display();
		
		Member s3 = new Member();
		s3.display();
		
		Member s4 = new Member("이성진");
		s4.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
