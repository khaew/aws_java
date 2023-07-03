package ch20_컬렉션;

public class TestUserArrayMain {
	
	public static void main(String[] args) {
		
		TestUser[]  testUser = new TestUser[3];
		testUser[0] = TestUser.builder().username("aaa").password("1234").build();
		testUser[1] = TestUser.builder().username("bbb").password("1111").build();
		testUser[2] = TestUser.builder().username("ccc").password("2222").build();
		
		
	}

}
