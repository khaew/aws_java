package ch07_클래스;

public class B {

		//반환x 매개변수x
		void test1() {   //void = 반환이없다.
			System.out.println("test1 메소드호출");
	}
		//반환ㅇ 매개변수x
		int test2() {
			System.out.println("test2 메소드호출");
			return 100;
		}
		boolean test3() {
			System.out.println("test3 메소드 서비스를 실행합니다.");
			return test2()==100;
		}
		void test4(String name, int age) {  
			System.out.println("이름:"+name);
			System.out.println("나이:"+age);
		}
		void test4(int age, String name) {    //오버로딩(매개변수 자료형이 다르면 동일 메소드 사용가능)
			System.out.println("나의점수:"+age);
			System.out.println("나의 이름:"+name);
		}
	
}
