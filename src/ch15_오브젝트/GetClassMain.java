package ch15_오브젝트;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassMain {

	public static void main(String[] args) {
		
		KoreaStudent koreaStudent = new KoreaStudent("20230001", "김ㅇㅇ");
		
		Method[] methods = koreaStudent.getClass().getDeclaredMethods();
		
		for(int i = 0; i<methods.length; i++) {
			System.out.println(methods[i].getName());    //메소드소환!
			System.out.println(methods[i].getReturnType());  //리턴타입 소환!
		}
	
		System.out.println();    //////////////////////////////////////////////////////
		
		Field[] fields = koreaStudent.getClass().getDeclaredFields();
		for(int i = 0; i<fields.length; i++) {
			System.out.println(fields[i].getName());    //필드소환!
		}
		
	
		System.out.println();    //////////////////////////////////////////////////////
		System.out.println(KoreaStudent.class == koreaStudent.getClass());
		System.out.println(koreaStudent instanceof KoreaStudent);
		
		System.out.println(koreaStudent.getClass().getSimpleName());
		System.out.println(koreaStudent.getClass().getName());
	}

}

