package ch11_문자열;

public class String01 {

	public static void main(String[] args) {
	
		String str = "코리아 아이티 아카데미";   //true
		//System.out.println(str);
		System.out.println(str == "코리아 아이티 아카데미");
	
		System.out.println();
		
		String str1 = new String("코리아 아이티 아카데미");
		//System.out.println(str);
		System.out.println(str1 == "코리아 아이티 아카데미");

	}

}
