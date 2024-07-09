package scope;

public class Quiz3 {
	//블록에 따라 변수의 유효범위를 작성하세요.
	public static void main(String[] args) {
		Person person = new Person(); //main함수 안에서
		
		int i = 10; // main함수 안에서
		if(i>1) {
			String str = "안녕하세요"; //if문 {}안에서
		}
		
		for(int k=0; k<10; k++) { //for문 {}안에서
			System.out.println(k);
		}
	}
}
