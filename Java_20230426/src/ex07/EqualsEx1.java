package ex07;

class Value{
	int value;
	String name;
	
	public Value(String name,int value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "[name : " + name + ", value :" + value + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Value m = (Value)obj;
//		if(this.value == ((Value)obj).value )
		if(this.value == m.value )
			return true;
		else 
			return false;
		
//		return this.value == ((Value)obj).value ? true : false;
	}
}

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value("kim",10);
		Value v2 = new Value("park",10);
		
		System.out.println(v1 == v2);
		System.out.println(v1.equals(v2));
		System.out.println("---------------------");
		System.out.println(v1.toString());
		System.out.println(v2);
	}

}
