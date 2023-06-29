package ch06_반복;

import java.util.Scanner;

public class while01 {

	public static void main(String[] args) {
		/*
		 * 순서, 인덱스  - for
		 * 조건 - while
		 */

		Scanner scanner  = new Scanner(System.in);
		int selecNumber = 0;
		boolean flag = true;  //선언 위치 영향 있음. 

		while(flag) {

			System.out.println("[메뉴]");
			System.out.println("1.1번");
			System.out.println("2.2번");
			System.out.println("3.3번");
			System.out.println("4.4번");
			System.out.println("5.종료");
			System.out.println("메뉴번호");

			selecNumber = scanner.nextInt();
			if(selecNumber == 5) {
			flag = false;   //or break;    //break보다 flag를 많이씀.
			}else if(selecNumber == 1) {
				boolean flag2 = true;
				char selectedMenu =0;
				while(flag2) {
					System.out.println("[1번메뉴 안쪽]");
					System.out.println("a.a메뉴");
					System.out.println("b.b메뉴");
					System.out.println("c.뒤로가기");
					System.out.println("d.종료");
					System.out.println("메뉴선택: ");
					selectedMenu =scanner.next().charAt(0);

					if(selectedMenu == 'c') {
						flag2 = false;
					}
				}
			}
		}
		System.out.println("프로그램종료");
	}
}

	