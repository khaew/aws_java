package ch17_추상;

import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true) //super까지 자동으로 호출

public class SmartPhone extends SmartDevice{

	
	private String phoneNumber;

	
	public SmartPhone(String diviceName, double displaySize, String phoneNumber) {
		super(diviceName, displaySize);
		this.phoneNumber = phoneNumber;
	}
	public void connectedWiFi() {
		System.out.println("스마트폰의 와이파이에 연결합니다.");
	
	}
}







		
	


