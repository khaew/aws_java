package ch17_추상;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@Data

public abstract class SmartDevice {  //추상클래스   (){} x >>   ();
	
	protected  String diviceName;
	private double displaySize;
	
	
	public abstract void connectedWiFi();
	
	
}
