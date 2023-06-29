package ch12_상속;

public class ProductMain {

	public static void main(String[] args) {
		
		Computer computer = new Computer("삼성컴퓨터",1000,"데스크탑");
		
		System.out.println(computer.getModel());
		System.out.println(computer.getPrice());
		System.out.println(computer.getType());
		
		System.out.println();
		
		
		Product product = computer;
		Computer computer2 = (Computer)product;
		
		computer2.getType();


		
		Clothes clothes = new Clothes("상의", 2000, "L", "BLACK");
		
		
	
	}

}
