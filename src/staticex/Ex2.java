package staticex;

public class Ex2 {

	public static void main(String[] args) {
		

	}

}

class Student2 {
	private static int count = 0;
	int studentId;
	String studentName;
	
	public Student2() {
		count++;
		studentId = count;
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int cnt) {
		count = cnt;
		//studentName = "둘리"; static 메소드 안에서 인스턴스 변수 사용 불가 생성시점이 스태틱이 가장 빠름. 인스턴스변수는 아직 생성 안됨
	}
}
