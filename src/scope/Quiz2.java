package scope;

//인스턴스변수, 클래스변수/ 전역변수, 지역변수 구분에 따라 변수의 유효범위를 작성하세요
class Person {
	String personName; //인스턴스변수: 인스턴스가 생성될 떄 생성 / 전역변수 : 클래스 안에서 어디서나
	int personAge; //인스턴스변수 전역변수
	static char gender = 'F'; //클래스변수:프로그램이 처음 시작할 때부터 / 전역변수 :클래스 안에서 어디서나
	
	public void setPersonName(String name) {
		this.personName = name; // 매개변수 / 지역변수 : 함수가 생성될 때 함수 안에서만 
	}
}