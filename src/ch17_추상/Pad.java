package ch17_추상;

import lombok.Data;
import lombok.ToString;

@ToString(callSuper = true)  //super까지 자동으로 호출

public class Pad extends SmartDevice{

	private boolean avilabilityPen;

	public Pad(String diviceName, double displaySize, boolean avilabilityPen) {
		super(diviceName, displaySize);
		this.avilabilityPen = avilabilityPen;
	}
	
	public void connectedWiFi() {
		System.out.println("패드의 와이파이에 연결합니다.");
	
	}
}

	

