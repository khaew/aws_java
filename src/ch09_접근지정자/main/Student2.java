package ch09_접근지정자.main;

public class Student2 {
	private String name;
	private int age;
	
	private void test() {  //private외부호출불가.
		System.out.println("테스트 메소드 호출");
	}
	
	//setter 값을 세팅,저장 해준다.(setName)
	public void setName(String name) {  //public 설정해야 타 패키지 조회가능
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Getter  값을 가져온다.(getName)
	public String getName() {
		return name;
	}
	public int age () {
	return age;
}
}

	
