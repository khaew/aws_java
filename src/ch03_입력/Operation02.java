package ch03_입력;
/*
 * 논리연산자
 * 1. && > and > 곱 
 *	true && false(0) = false  (1 x 0 = 0 )        /false는 무조건 0, true는 0만 아니면 됨. 
 * 
 * 2. || > or  >  합
 *  true  || true = true  (1 + 0 = 0 초과 )
 *  
 * 3. ! > not
 *  !(true || false) = false
 */



public class Operation02 {


	public static void main(String[] args) {

		final int MAX = 100;   //final = 상수, 값 변경 불가
		final int MIN = 0;
		int num = -10;


		System.out.println(MAX < num);
	    //System.out.println(MIN < num < < MAX);   -불가
		System.out.println(MIN < num && MAX > num);   
		/*
		 * 
		 */
	}
}

