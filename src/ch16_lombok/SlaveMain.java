package ch16_lombok;

public class SlaveMain {
	public static void main(String[] args) {
	
		Slave slave = new Slave("김ㅇㅇ", 25);
		
		System.out.println(slave);

		System.out.println(slave.getAge());
		System.out.println(slave.toString());
	}

}
