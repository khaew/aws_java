package ch06_반복;

public class for02 {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);


		//초기 선언 무조건 0; 반복횟수; 1씩증가 후처리
		//  초기식 ; 조건식 ; 증감식

		for(int i  = 0; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i  = 0; i <= 10; i++) {
			System.out.print(i);
		}

		String str = "코리아아이티";
		System.out.println(str.substring(0,3));

	}
}
