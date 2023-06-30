package ch14_싱글톤;
import java.util.*;
import java.util.Date;
//이것만 쓰겠다/어디서나 쉽게 접근(STATIC을 활용함)
public class FactoryMain {

	public static void main(String[] args) {
		Samsung samsung = Samsung.getInstance();    //기존 public에서 private로 변경.(new Samsung >> Samsung.getInstance)
		System.out.println(Samsung.getCompanyName());
		
		SamsungFactory factory1 =new SamsungFactory();
		SamsungFactory factory2 =new SamsungFactory();
		
		factory1.produce("갤럭시s").showInfo();
		factory2.produce("갤럭시s2").showInfo();
		factory1.produce("갤럭시s3").showInfo();		
	}	
}


