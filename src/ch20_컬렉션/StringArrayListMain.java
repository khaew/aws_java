package ch20_컬렉션;

import java.util.ArrayList;
import java.util.LinkedList;

public class StringArrayListMain {

	public static void main(String[] args) {
		
		CustomArrayList list=new CustomArrayList();
			
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add(1,"f");
		list.remove(2);
			
		System.out.println(list);	
		System.out.println("=====================");
		
		ArrayList list1 = new ArrayList<>();  
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add(1,"f");
		list1.remove(2);
		
		System.out.println(list1);	
		
		System.out.println("=====================");
		
		ArrayList<String> arrayList = new ArrayList<String>();  //index
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("e");
		arrayList.add(1,"F");
		arrayList.remove(4);
		System.out.println(arrayList);
		arrayList.set(0, "h");
		System.out.println(arrayList);
		
		LinkedList<String> linkedList = new LinkedList<>(); //node
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		System.out.println(linkedList);
		
		
		//add, contains, foreach, get, indexOf, lastIndexOf, remove, toArray

	}

}
