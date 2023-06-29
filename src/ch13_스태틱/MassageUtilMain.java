 package ch13_스태틱;

import ch10_배열.Array01;

public class MassageUtilMain {
	
	private int a;

	
	public static void main(String[] args) {
		
		MassageUtilMain massageUtilMain = new MassageUtilMain();
		System.out.println(massageUtilMain.a);
		
		System.out.println(massageUtilMain.a);
		
		Array01.main(null);
		
		MassageUtil messageUtil = new MassageUtil();
		
		//static 공유
		
		messageUtil.sendMail();
		messageUtil.sendFile();
		
		MassageUtil.sendFile();
		System.out.println();
		MassageUtil.data = "안녕";
		System.out.println(MassageUtil.data);
		
		System.out.println(messageUtil.data);
		

	}

}
