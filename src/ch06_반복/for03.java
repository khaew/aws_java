package ch06_반복;

public class for03 {

	public static void main(String[] args) {
		//별찍기

		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		
		//별찍기 (역순)
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//별찍기(오른쪽정렬)
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		}
	
	}

