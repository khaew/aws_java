package ch05_조건;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {


		String name = "가길동";
		System.out.println(name.charAt(0));  //숫자는 index,위치번호.
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));

		
		
		 Scanner scanner = new Scanner(System.in);
		
		 
		 char cmd1 = ' ';
		System.out.println("명령 선택:");
		
		cmd1 = scanner.next().charAt(0);
		//입,출력 형태 다 맞춰줘야함.
		switch (cmd1) {
		case 'c' : 
			System.out.println("데이터를 생성합니다.");
			break;
		case 'r' : 
			System.out.println("데이터를 조회합니다.");
			break;
		case 'u' : 
			System.out.println("데이터를 수정합니다.");
			break;
		case 'd' : 
			System.out.println("데이터를 삭제합니다.");
			break;
		default : 
			System.out.println("나머지");
			


	}

}}
