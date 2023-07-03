package ch19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Response <T> {
	
	private int statusCode;
	private T data;

}
