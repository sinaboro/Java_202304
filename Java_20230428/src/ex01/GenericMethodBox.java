package ex01;

class Box{
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
}

class Unboxer{
	public static Object openBox(Box box) {
		return box.getOb();
	}
}

public class GenericMethodBox {

	public static void main(String[] args) {
		Box box = new Box();
		box.setOb("100");
		
//		int tmp =   (Integer)Unboxer.openBox(box);
		System.out.println( box.getOb());
		
		
		box.setOb(12.5);
		double f = (Double)Unboxer.openBox(box);		
		
		box.setOb("korea");
		String str = (String)Unboxer.openBox(box);
	}

}
