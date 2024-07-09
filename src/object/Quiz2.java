package object;

public class Quiz2 {

	public static void main(String[] args) {
		Student stu = new Student("나나", 5000);
		Taxi taxi = new Taxi("마2313");
		
		stu.takeTaxi(taxi);
		stu.showInfo();
		taxi.showInfo();
		
	}
}

class Taxi {
	String taxiname;
	int passengerCount;
	int money;
	
	//지하철 노선번호를 초기화하는 생성자
	public Taxi(String taxiname) {
		this.taxiname = taxiname;
	}
	
	//승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시 "+taxiname+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}

