package ch15_오브젝트;

import java.util.Objects;

public class KoreaStudent {
	
	private String studentCode;
	private String name;
	
	
	public KoreaStudent(String studentCode, String name) {
		super();
		this.studentCode = studentCode;
		this.name = name;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, studentCode);
	}

	//alt + shift + s  >> hashcode 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KoreaStudent other = (KoreaStudent) obj;
		return Objects.equals(name, other.name) && Objects.equals(studentCode, other.studentCode);
	}
	
	public String getStudentCode() {
		return studentCode;
	}


	public String getName() {
		return name;
	}

	public void ShowInfo() {
		System.out.println("학번:"+studentCode);
		System.out.println("이름:"+name);
		System.out.println("=====================");
				
	}


	@Override   //toString 재정의  //alt + shift + s  >> toString
	public String toString() {
		return "KoreaStudent [studentCode=" + studentCode + ", name=" + name + "]";
	}


	
}


