package ch15_오브젝트;

import java.util.Scanner;

public class ScannerString {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		String username = "aaa";
		String password = "1234";
		String inputUsername = null;
		String inputPassword = null;
		
		
		System.out.print("아이디:");
		inputUsername = scanner.nextLine();
		System.out.print("비밀번호:");
		inputPassword = scanner.nextLine();
		
		System.out.println("입력된아이디:" + inputUsername);
		System.out.println("입력된비밀번호:" + inputPassword);
		
		
		//if(username != inputUsername) {  //주소비교
		 if(!username.equals(inputUsername)){ // 오버라이드 재정의한 equals 이용
			System.out.println("아이디가 일치하지 않습니다.");
			return;
		}
		if(!password.equals(inputPassword)){
			System.out.println(("비밀번호가 일치하지 않습니다."));
			return;
		}
		System.out.println("로그인성공!");
		
		

	}

}
