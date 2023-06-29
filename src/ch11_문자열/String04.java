package ch11_문자열;

public class String04 {

	public static void main(String[] args) {
		
		//replaceall(테스트교체)
		String phone = "       010-1234-4567";
		String replacephone = phone
				.replaceAll("-", "")
				.replaceAll(" ","")
				.replaceAll("[.]","");   // . 은 예약어라 대괄호 쳐야함.
		
		System.out.println(replacephone);
		
		//trim(앞뒤쪽 공백제거)
		String phone2 = phone.trim();
		System.out.println(phone2);
		
	}

}
;