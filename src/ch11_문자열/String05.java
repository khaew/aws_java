package ch11_문자열;

public class String05 {

	public static void main(String[] args) {
	
		String name = " ";
		
		
		//텍스트 공백 여부(완전 공백만)
		boolean flag = name.isBlank();
		System.out.println(flag);
		System.out.println(name.isBlank());
		
		//텍스트 공백 여부(공백도 문자열로 해당함)
		boolean flag2 = name.isEmpty();
		System.out.println(flag2);
		System.out.println(name.isEmpty());
		
	
		
	}

}
