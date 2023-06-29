package ch02_변수;

public class Variable {

	public static void main(String[] args) {
	
				//자료형
				boolean flag; //선언
				flag = false; //초기화
				System.out.println("FLAG:"+flag);
				System.out.println("FLAG:");
				System.out.println(flag);

				char lastName = '김';
				System.out.println(lastName);

				System.out.println();
				int number = 100;
				System.out.println("점수:"+number);

				System.out.println();
				double pi = 3.14;
				System.out.println(pi);

				System.out.println();
				String name = "김해원";
				System.out.println(name);

				System.out.println();
				String num1 = "10";
				int num2 = 10;
				System.out.println("String:"+num1);
				System.out.println("int:"+num2);
				System.out.println(num1 + num2);
				System.out.println(Integer.parseInt(num1)+10);  //integer 형변환, 강제형

		
				//업캐스팅  (문자->정수->실수)
				System.out.println();
				char num3 = '5';  //'character형 5의 아스키코드 53' +10
				System.out.println(num3 + num2);
				System.out.println((int)num3);  //강제 형변환
				System.out.println((double)num3);  //강제 형변환

				System.out.println();
				//1.묵시적 형변환(업캐스팅)
					int num4 = num3;
					System.out.println(num4);  //num3 '5'가 아스키코드 53으로 묵시적형변환되어 출력
			   //2.명시적 형변환(다운캐스팅 실수->정수->문자)
					char num5 = (char)num4;   //변환할 형태를 입력해 강제로 형변환함(다운캐스팅)
					System.out.println(num5);

			/*
			 * 상수 : 변하지 않는값
				ex) (앞에 final 붙여줌, 대문자>)final double PI = 3.14f
			 */

			}
		}