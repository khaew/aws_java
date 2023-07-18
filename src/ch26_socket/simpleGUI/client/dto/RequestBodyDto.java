package ch26_socket.simpleGUI.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class RequestBodyDto <T> {
	
	private String resourse;    //명령
	private T body;

}
