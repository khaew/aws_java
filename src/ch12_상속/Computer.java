package ch12_상속;

public class Computer extends Product{
	
	
	private String type;
	
//	public Computer() {
//		super(" ",10);
//		System.out.println("컴퓨터 객체 생성(sub2)");
//	}
	
	
	public String getType() {
		return type;
	}

//	public Computer(String type) {
//		super();
//		this.type = type;
//	}

	
	

	public Computer(String model, int price, String type) {
		
		super(model, price);
		this.type = type;
	
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	}


