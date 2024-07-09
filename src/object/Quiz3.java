package object;

public class Quiz3 {

	public static void main(String[] args) {
		Customer cus1 = new Customer("둘리", 10000);
		Customer cus2 = new Customer("또치", 20000);
		
		Cafe cafe = new Cafe("별다방");
		
		cus1.buyAhah(cafe);
		cus1.showInfo();
		cafe.showInfo();
		cus2.buyLatte(cafe);
		cus2.showInfo();
		cafe.showInfo();
		
	}

}

class Cafe {
	String cafeName; 
	String menu;
	int money;
	
	public Cafe(String cafeName) {
		super();
		this.cafeName = cafeName;
	}
	
	public void sell(int money) {
		this.money = this.money + money;	
	}
	
	public void showInfo() {
		System.out.println(cafeName+"의 수입은 "+money+"입니다.");
	}
}

class Customer {
	String name;
	int money;
	
	
	public Customer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}


	public void buyAhah(Cafe cafe) {
		if(money < 4000) {
			System.out.println("소지금액이 메뉴가격보다 적습니다.");
			return;
		}
		cafe.sell(4000);
		this.money = this.money - 4000;
	}
	
	
	public void buyLatte(Cafe cafe) {
		if(money < 4500) {
			System.out.println("소지금액이 메뉴가격보다 적습니다.");
			return;
		}
		cafe.sell(4500);
		this.money = this.money - 4500;
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"입니다.");
	}
}