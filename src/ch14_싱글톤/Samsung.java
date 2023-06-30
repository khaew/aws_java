package ch14_싱글톤;
import java.time.LocalDate;
import java.util.Date;
import org.xml.sax.SAXNotRecognizedException;

public class Samsung {	
	private static Samsung instance;  //인스턴스는 삼성객체를 담는다.

	private static String CompanyName;
	private int AutoIncrementSerialNumber = LocalDate.now().getYear()*10000;
	
	private Samsung() {
		CompanyName = Samsung.class.getSimpleName().toUpperCase();
	}
	
	public static Samsung getInstance() {
		if(instance == null) {
			instance = new Samsung();
		}
		return instance;
	}
	public int getAutIncrementSerialNumber() {
		return AutoIncrementSerialNumber;
	}
	public void setAutIncrementSerialNumber(int autIncrementSerialNumber) {
		this.AutoIncrementSerialNumber = autIncrementSerialNumber;
	} 
	public static String getCompanyName() {
		return CompanyName;
	}

	public int getAutoIncrementSerialNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
		
	}

	


