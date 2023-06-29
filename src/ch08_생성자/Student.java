package ch08_생성자;
 
public class Student {	
	String name;  //require 생성되면 noargu 오류생겨서 상수처리.
	int age;
	String address;
	
	 //오버로딩이 시작되면 원래 있던 noarg는 바로 사라짐.
	  //allarg 쓰고싶으면 noarg 따로 만들어줘야함.
	
//	Student(){   //no argu = 생성자가 없다.
//		name=" "; //require 생성되면 noargu 오류생겨서 상수처리 후 한번 더 생성.
//		System.out.println("NoArgsConstructor");
//		System.out.println("학생 한명을 생성합니다.");
//	}
	Student(String name, int age, String address){ //(all argu)
		System.out.println("AllArgsConstructor");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	Student(String name){    //noargu와 공존할수없다.
		System.out.println("RequiredArgsConstructor");
		this.name = name;
	}
	}
	


