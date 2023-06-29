package ch10_배열;

public class Array01 {

	public static void main(String[] args) {
		
		int []numbers= new int[5];
			numbers[0]=10;
			numbers[1]=20;
			numbers[2]=30;
			numbers[3]=40;
			numbers[4]=50;
			
			int in = 0;
			int index3 = 3;
		System.out.println(numbers[in]);
		System.out.println(numbers[index3]);
		
		System.out.println();
		
		for(int i = 0; i<numbers.length; i++) {  //numbers.length >>배열 자동으로 가져옴.
			System.out.println(numbers[i]);
		}
		
		System.out.println();
		
		int[] numbers2 = {1, 2, 3, 4, 5};
		System.out.println(numbers2[2]);
		int[] numbers3 = new int[] {6, 7, 8, 9, 10};
		
	//	sum(numbers);
		sum(new int[] {6, 7, 8, 9, 10});

	}
	public static void sum(int[] array) {
		int result = 0;
		for(int i = 0; i<array.length; i++) {
			result +=array[i];	  // result = result + array[i];
		}
		System.out.println(result);
		}
	}
	


