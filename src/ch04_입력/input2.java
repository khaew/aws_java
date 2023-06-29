package ch04_입력;

import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

		 /*
		  * 이름 : 
		  * 나이 : 
		  * 연락처 : 
		  * 주소 : 
		  * 성별 : 
		  * 고객님의 이름은 000 이고 나이는 00살세입니다. 연락처는 ~~~~~ 이며 주소는 ~~~~~~~ 입니다.
		  * 성별은 0 입니다.
		  */

		 

		 String name = null;  //=String name=" " ;
		 int age = 0;
		 String phone = null;
		 String address=null;
		 String gender=null;

		 
		 System.out.print("이름? : ");
		 name = scanner.nextLine();
		 System.out.print("나이? :");
		 age = scanner.nextInt();
		 System.out.print("연락처?:");
		 scanner.nextLine();  //버퍼방지.(엔터먹기위한)
		 phone = scanner.nextLine();
		 System.out.print("주소? : ");
		 address = scanner.nextLine();
		 System.out.print("성별? : ");
		 gender = scanner.nextLine();
		System.out.println("고객님의 이름은 "+name+"이고,"+"나이는"+age+"세 입니다."+"\n연락처는 "+phone+" 이며 "
			+"주소는 "+address+" 입니다."+"\n성별은 "+gender+" 입니다.");



	}

}
