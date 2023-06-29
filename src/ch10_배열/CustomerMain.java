package ch10_배열;

public class CustomerMain {

	public static void main(String[] args) {
	
		Customer[] customers = new Customer[10]; //10명이 앉을수 있는 자리.
		
//		Customer customer1 = new Customer("김해원","gold"); //인스턴스생성
//		Customer customer2 = new Customer("박해원","silver");
//		Customer customer3 = new Customer("이해원","vip");		
		customers[0] = new Customer("김해원","Gold"); //인스턴스생성
		customers[1] = new Customer("박해원","Silver");
		customers[2] = new Customer("이해원","Vip");
		
		for(int i = 0; i<customers.length; i++) {
			if(customers[i] != null)
			customers[i].showInfo();
//			if(customers[i] == null) {  위와동일
//				continue;
			}
		}
		
//		customer1.showInfo();
//		customer2.showInfo();
//		customer3.showInfo();
	
}

