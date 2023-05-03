package ex03;

class A{}
class B extends A{}
class C extends B{}

class Box<T extends A> {
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static <T extends A> T openBox(Box<T> box) {
		return box.getOb();
	}
}


public class GenericMethodBox {

	public static void main(String[] args) {
		
		Box<C> cBox= new Box<C>();
		
		Box<B> bBox = new Box<B>();
		
		Box<A> aBox = new Box<A>();
		//Box<A> aaBox = new Box<B>(); error;
		
		
		
		
	}

}
