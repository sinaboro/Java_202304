package ex04;

class Apple{  //사과
	public String toString() {
		return "I am an apple";
	}
}

class Orange{ //오렌지
	public String toString() {
		return "I am an orange";
	}
}

class Box{ //사과, 오렌지 담는 박스
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}



public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box();  //사과
		Box oBox = new Box();  //오렌지
		
		//aBox.setObj(new Apple());
		
		aBox.setObj("Apple");  //사과 저장
		oBox.setObj("Orange");  //오렌지 저장
		
//		Apple ap  = (Apple)aBox.getObj();  //꺼내기
//		Orange op = (Orange)oBox.getObj();
//		System.out.println(ap);
//		System.out.println(op);
		
		System.out.println(aBox.getObj());
		System.out.println(oBox.getObj());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
