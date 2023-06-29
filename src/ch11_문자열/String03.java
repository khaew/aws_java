package ch11_문자열;

public class String03 {

	public static void main(String[] args) {
	
		
		String[] addressArray = new String[] {
				"부산시 동래구",
				"부산시 부산진구",
				"창원시 마산합포구",
				"창원시 진해"};
						
//		String[] Array2 = new String[10];
//		String[] Array3 = new String[10];


			System.out.println("[부산시]");
			for(int i = 0; i<addressArray.length; i++) {
				if(addressArray[i].contains("부산시"))
				System.out.println(addressArray[i]);
			}
			System.out.println("[창원시]");
			for(int i = 0; i<addressArray.length; i++) {	
				if(addressArray[i].contains("창원시"))
				System.out.println(addressArray[i]);
			}

	}
	}

