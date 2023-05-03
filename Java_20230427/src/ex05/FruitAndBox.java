package ex05;

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

class Box<T>{ //사과, 오렌지 담는 박스
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}



public class FruitAndBox {

	public static void main(String[] args) {
		
		Box<Apple> aBox = new Box<Apple>();  //사과
		Box<Orange> oBox = new Box<Orange>();  //오렌지
		
		//aBox.setObj(new Apple());
		
		aBox.setObj(new Apple());  //사과 저장
		oBox.setObj(new Orange());  //오렌지 저장
		
		Apple ap  = aBox.getObj();  //꺼내기
		Orange op = oBox.getObj();
		System.out.println(ap);
		System.out.println(op);
		
//		System.out.println(aBox.getObj());
//		System.out.println(oBox.getObj());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
