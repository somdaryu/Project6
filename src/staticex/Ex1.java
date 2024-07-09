package staticex;

public class Ex1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + "학번: "+student1.studentId);
		
		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + "학번: "+student2.studentId);
		
		Student student3 = new Student();
		student3.studentName = "도우너";
		System.out.println(student3.studentName + "학번: "+student3.studentId);	
		
		System.out.println(Student.count);
	}
}

class Student {
	static int count = 0; //학생의 수 (공통속성)
	int studentId; //학번
	String studentName; //이름
	
	public Student() {
		count++; //학생이 생성될때마다 증가
		studentId = count; //증가된 값을 학번에 부여
	}
}