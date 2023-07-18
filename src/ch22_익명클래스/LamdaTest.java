package ch22_익명클래스;

public class LamdaTest {

	public static void main(String[] args) {
		GrantedAuthorities authorities2 = new GrantedAuthorities() {
			
			//인터페이스는 하나의 함수 or 추상메서드만 존재해야한다.
			//일반메서드 쓰려면 앞에 default
			//매개변수 자료형 생략가능 / 매개변수가 하나면 괄호도 생략가능
			
			@Override
			public String getAuthority() {
				System.out.println("권한출력");
				 return"ROLE_USER";
			}
		};
		
		
//		GrantedAuthorities authorities = () -> {
//			System.out.println("권한출력");
//			return"ROLE_USER";
//		};
		GrantedAuthorities authorities = () -> "ROLE_USER";
	
		
		System.out.println(authorities.getAuthority());
		
		System.out.println(authorities);
		
		
	}

}
