package ch15_오브젝트;

public class EqualsMain {
	
	public static void main(String[] args) {
		
		//같다는 두가지의미 = 주소 or 데이터(사용자입장)
		
		KoreaStudent koreaStudent1 = new KoreaStudent("20230001","변ㅇㅇ");
		KoreaStudent koreaStudent2 = new KoreaStudent("20230002","정ㅇㅇ");
		KoreaStudent koreaStudent3 = new KoreaStudent("20230003","이ㅇㅇ");
		KoreaStudent koreaStudent4 = new KoreaStudent("20230001","변ㅇㅇ");
		
		//메모리주소 비교
		System.out.println(koreaStudent1 == koreaStudent4);
		//값비교
		System.out.println(koreaStudent1.getStudentCode() == koreaStudent4. getStudentCode()
				&&  koreaStudent1.getName() == koreaStudent4.getName());
		
		
		System.out.println(koreaStudent1.equals(koreaStudent4));
		
		
		
	}

}
