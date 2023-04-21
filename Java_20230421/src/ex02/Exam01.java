package ex02;

class Buyer{
	int money = 1000;
	Product[] cart = new Product[3]; //i=0,1,2 =>
	int i = 0;
	
	//1. 가진돈과 물건의 가격을 비교해서 가진 돈이 적으면 메소드 종료
	//2. 가진 돈이 충분하면, 제품의 가격을 가진돈에서 빼고
	//장바구니에 구입한 물건을 담는다. add메서도 호출
	void buy(Product p) {  //100
		if(money < p.price) {
			System.out.println("소지한 돈은 " + money + "입니다. " 
		+ (p.price-money) + "부족합니다.");
			return ;
		}
		money -= p.price;
		add(p);  //구입한 물건은 Tv, Audio,Computer, Computer
		
	}
	//공간부족하면 기존 크기*2확장해라..
	void add(Product p) {
		
		if(i>=cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
//			for(int j=0; j<cart.length; j++)
//				tmp[j] =cart[j];
			cart = tmp;
		}
		cart[i] = p;
		i++;
	}
	
	//구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
	void summary() {
		System.out.print("구입한 물건 : ");
		for(int i=0; i<cart.length; i++)
			System.out.print(cart[i] + ",");
		System.out.println();
		System.out.println("사용한 금액 : " + (1000-money));
		System.out.println("남은 금액 : " + money);
	}
}

class Product{
	int price;
	public Product(int price) {
		this.price = price;
	}
}

class Tv extends Product{
	public Tv() { super(100);	}
	public String toString() { return "Tv";}
}
class Computer extends Product{
	public Computer() {super(200);}
	public String toString() { return "Computer";}
	
}
class Audio extends Product{
	public Audio() {super(50);}
	public String toString() { return "Audio";}
}


public class Exam01 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
		
		
//		Product[] cart = new Product[3];
//		cart[0] = new Tv();
//		cart[1] = new Computer();
//		cart[2] = new Audio();
//		System.out.println(cart[0]);
//		System.out.println(cart[1].toString());
//		System.out.println(cart[2].toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}
