package ch26_socket.simpleGUI.server.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class SendMessage {
	
	private String fromUsername;     //보낸사람
	private String toUsername;		 //받은사람
	private String messageBody;   	 //내용

}
