package ch26_socket.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Simpleserver {

	public static void main(String[] args) {
		
		try {
			System.out.println("서버실행");
			ServerSocket serverSocket = new ServerSocket(8000);  //포트 이미 사용 가능성이 있어 try/catch
			
			List<Socket> socketList = new ArrayList<>();
			
			while(true) {
				
				Socket socket = serverSocket.accept();	//클라이언트 접속 대기
				socketList.add(socket);
				
				Thread thread = new Thread(() -> {
					Socket threadsocket = socket; 
					while(true) {
						System.out.println("데이터 입력 기다림");
						BufferedReader bufferedReader;
						try {
							InputStreamReader inputStreamReader = new InputStreamReader(threadsocket.getInputStream());
							bufferedReader = new BufferedReader(inputStreamReader);
							String requestBody = bufferedReader.readLine();
							
							
							socketList.forEach( s -> {
							try {
								PrintWriter printWriter = new PrintWriter(s.getOutputStream(),true);
								printWriter.println("메세지내용("+requestBody+")");
							} catch (IOException e) {		
							e.printStackTrace();
							} 		
						 });
						}catch(IOException e) {
							e.printStackTrace();
						}
					}
					});
				thread.start();
			}
			}catch(IOException e){
				}
			}
		}

