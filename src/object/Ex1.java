package object;

public class Ex1 {

	public static void main(String[] args) {
		//만원을 가진 둘리라는 학생을 만든다.
		Student stu = new Student("둘리", 10000);
		//100번 버스를 만든다
		Bus bus = new Bus(100);
		
		//학생이 100번버스에 탄다
		stu.takeBus(bus);
		stu.showInfo();
		bus.showInfo();
	}

}

class Bus{
	int busNumber;
	int passengerCount;
	int money;
	
	//버스번호를 초기화하는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스"+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}

class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	//지하철 노선번호를 초기화하는 생성자
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철"+lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}

class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	//버스에 타서 요금을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money = this.money - 1000;
	}
	
	//지하철에 타서 요금을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money = this.money - 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+money+"입니다.");
	}
}