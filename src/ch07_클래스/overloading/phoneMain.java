package ch07_클래스.overloading;

public class phoneMain {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		phone.send();
		phone.send("안녕하세용");
		phone.send("010","안녕하세용");
		phone.send("안녕하세용.",2);

	}

}
