package ch03_입력;

public class Operation03 {

	public static void main(String[] args) {
		//삼항연산자 = 조건연산자
				//줄바꿈 기준 : 연산자 앞에
				 int a = 4;
				 int b = 9;
				 int c = 10;
				 int max = 0;

				 max  = a <  b ? b : a;
				 max = max < c ? c: max;
				 System.out.println(max);
				 System.out.println( c <  a ? a  : ( c < b ? b : c ));

				int score = 95;
				String result  = score < 0 || score > 100 ? "X" 
						: score > 89 ? "A"
					    : score > 79 ? "B"   //순서 영향받음
				     	: score > 69 ? "C"
						: score > 59 ? "D"
						: "F";
						System.out.println(result);

						

	}

}
