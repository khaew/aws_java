package ch22_익명클래스;

public class AuthorityMain {

	public static void main(String[] args) {
		
		GrantedAuthorities authorities = new GrantedAuthorities() {
			
			@Override
			public String getAuthority() {
				System.out.println("권한출력");
				return "ROLE_USER";
			}
		};
		
		System.out.println(authorities.getAuthority());
		
		
		System.out.println();
		
		A a = new A();
		System.out.println(a.getAuthority());
	}

}
class A implements GrantedAuthorities{  //클래스명이랑 파일명이랑 일치해야함.(public 붙이면 그게 메인)

	@Override
	public String getAuthority() {
		System.out.println("두번째권한출력");
		return "ROLE_ADMIN";
		
	}
	
}
