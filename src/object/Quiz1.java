package object;

public class Quiz1 {

	public static void main(String[] args) {
		Student stu1 = new Student("둘리", 5000);
		Student stu2 = new Student("도우너", 10000);
		
		Bus bus = new Bus(100);
		stu1.takeBus(bus);
		
		Subway subway = new Subway("2호선");
		stu2.takeSubway(subway);
		
		stu1.showInfo();
		stu2.showInfo();
		bus.showInfo();
		subway.showInfo();
	}

}
