package test;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Company {
	

	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;

	}







