package ch19_제네릭;

public class ResponseMain {

	public static void main(String[] args) {
		
	Response<String> Response1 = new Response<String>(200, "회원가입성공!");
	System.out.println(Response1);
	
	SignupUser signupUser = SignupUser.builder()
			.username("AAA")
			.password("1234")
			.name("김ㅇㅇ")
			.email("aaa@gmail.com")
			.build();
	
	Response <SignupUser> response2 = new Response<SignupUser>(400, signupUser);
	System.out.println( response2);

	AccountUser accountUser = AccountUser.builder().username("aaa").password("1234").build();
	
	Response<?> response3 =new Response<AccountUser>(200, accountUser);
	//response3 = response2;
	
	
	UpdateUser updateUser = UpdateUser.builder()
			.username("AAA")
			.password("1234")
			.address("부산")
			.phone("010-0000-0000")
			.build();
	
	Response<UpdateUser> response4 = new Response<UpdateUser>(300, updateUser);
	
	printResponse(response2);
}
	public static Response<?> printResponse(Response<? super SignupUser> response){ //여러개 변수 들어갔을때 변화가능<?>
																			//<? extends AccountUser> account 상속받은 변수만.
	
		System.out.println(response);
		return response;
	}

}
