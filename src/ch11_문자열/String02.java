package ch11_문자열;

public class String02 {

	public static void main(String[] args) {
		
		String phone = "010-9988-1916";
		
		int index = phone.indexOf("-");
		int index0 = phone.lastIndexOf("-");
		int index1 = phone.indexOf("1");
		int index2 = phone.indexOf("19");
		System.out.println(index);
		System.out.println(index0);
		System.out.println(index1);
		System.out.println(index2);
		
		String midNum = phone.substring(4,8);
		System.out.println(midNum);
		
		String midNum1 = phone.substring(index+1,8);
		System.out.println(midNum1);
		
		
		//문자포함여부
		boolean findFlag= phone.contains("010");
		System.out.println(findFlag);
	}

}
