package test;

import com.google.gson.Gson;

public class CompanyMain {

	public static void main(String[] args) {
	
		Gson gson = new Gson();
		Company company = Company
		.builder()
		.companyId(100)
		.companyName("Apple")
		.address("Apple Computer Inc. 1 infinite Loop")
		.city("Cupertino")
		.state("CA")
		.zipCode("95014")
		.build();

		System.out.println(company);







		}

		}