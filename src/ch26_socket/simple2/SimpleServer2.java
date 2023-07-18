package ch26_socket.simple2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {

	public static void main(String[] args) {
		
		try {
			System.out.println("서버실행");
			ServerSocket serverSocket = new ServerSocket(8000);
			Socket socket = serverSocket.accept(); //클라이언트 접속대기
			
			Thread thread = new Thread(() -> {
				while(true) {
					System.out.println("데이터입력 기다림");
					BufferedReader bufferedReader;
					try {
						InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
						bufferedReader = new BufferedReader(inputStreamReader);
						System.out.println("jojoijio"+bufferedReader.readLine());
					//	socket.getInputStream().read(); 
					}catch(IOException e) {
						e.printStackTrace();  //e.printStackTrace() : 에러의 발생근원지를 찾아서 단계별로 에러를 출력
					}
				}
			});
		thread.start();
		
	}catch(IOException e) {
	
	}
	}
}
