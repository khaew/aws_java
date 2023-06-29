package ch11_문자열;

public class StringBuilder01 {

	public static void main(String[] args) {
		
	   StringBuilder builder = new StringBuilder();
	   builder.append("이름: ");
	   builder.append("김복자");
	   builder.delete(builder.indexOf(":"), builder.indexOf(":")+1);    // = builder.delete(2,3);
	   builder.insert(2, ">>");
	   
	   
	   String str = builder.toString();
	   System.out.println(str);
	   System.out.println(builder.toString());
	   
	   
	   //TEST : 스트링 빌더 사용하지 않고 : 제외출력.
	   String name = "이름: 김복자";
	   System.out.println(name.substring(0,2).concat(name.substring(3)));
	   
	 //  System.out.println(name.substring(0,name.indexOf(":")).concat(name.substring(name.indexOf(":")+1)));
	   
	   
	}
	

}
