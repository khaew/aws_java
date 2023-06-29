package ch11_문자열;

import java.util.StringTokenizer;

public class String06 {

	public static void main(String[] args) {
	
		
		
		
		String token = "Bearer aaaaabbbb.ccccccdddddd.eeeeeffffff";
		//텍스트 존재유무		
		boolean flag = token.startsWith("Bearer");
		System.out.println(flag);
		System.out.println(token.startsWith("Bearer"));
		
		String url = "/api/v1/user/1";
		boolean flag2 = url.startsWith("/api/vi");
		if(flag2==true){
			System.out.println("api 버전 1 사용");
			
			System.out.println();
	
			//tokenizer test
			String to = "010:0000000";
			String cut = ":";
			StringTokenizer token1 = new StringTokenizer(to,cut);
			
			System.out.println(token1.countTokens());
			System.out.println(token1.hasMoreTokens());
			System.out.println(token1.nextToken());
			System.out.println(token1.nextToken());
		
		}
		

	}

}
