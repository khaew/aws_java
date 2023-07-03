package ch18_빌더;

public class KoreamUserMain {
	
	public static void main(String[] args) {
		
	//	KoreaUser koreaUser = new KoreaUser(1,"kim","1234","ㄱㅇㅇ","kim@gmail.com");
		KoreaUser koreaUser = KoreaUser.builder()
				.userId(1)
				.username("aaa")
				.password("1324")
				.name("김ㅇㅇ")
				.email("kim@gmail.com")
				.build();
		
		System.out.println(koreaUser);
		System.out.println();
		System.out.println(koreaUser.getUserId());
		System.out.println(koreaUser.getUsername());
		System.out.println(koreaUser.getPassword());
		System.out.println(koreaUser.getName());
		System.out.println(koreaUser.getEmail());
		
		
		
	

	}

}
