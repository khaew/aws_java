package ch26_socket.client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ClientApplication extends JFrame {

	
	private Socket socket;
	
	private JPanel mainPanel;
	private JTextField ipTextField;
	private JTextField portTextField;
	private JTextField messageTextField;
		private JList connectedUserList;
	private JScrollPane connetedUserListScrollPane;
	private JScrollPane chatTextsAreaScrollPane;
	private JTextArea chatTextArea;
	private JButton messegeSendButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientApplication frame = new ClientApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 489);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		
		//<채팅내용>>
		 
		JScrollPane chatTextAreaScrollPane = new JScrollPane();
		chatTextAreaScrollPane.setBounds(12, 13, 330, 375);
		mainPanel.add(chatTextAreaScrollPane);
		
		JTextArea chatTextArea = new JTextArea();
		chatTextArea.setEditable(false);
		chatTextAreaScrollPane.setViewportView(chatTextArea);
		
		
	
		//<<<채팅연결>>>
		ipTextField = new JTextField();
		ipTextField.setBounds(354, 13, 164, 21);
		mainPanel.add(ipTextField);
		ipTextField.setColumns(10);
		
		portTextField = new JTextField();
		portTextField.setBounds(354, 44, 164, 21);
		mainPanel.add(portTextField);
		portTextField.setColumns(10);
		
		
		
		JButton connectionButton = new JButton("접속");
		connectionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String serverIp = ipTextField.getText();
				String serverPort = portTextField.getText();
				
				if(serverIp.isBlank() || serverPort.isBlank()) {
					JOptionPane.showMessageDialog(
							mainPanel, 
							"IP와 PORT번호를 입력해주세요.", 
							"접속오류",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				try {
					socket = new Socket(serverIp, Integer.parseInt(serverPort));
					JOptionPane.showMessageDialog(mainPanel, 
							"서버와의 연결에 성공하였습니다.","접속완료",JOptionPane
							.PLAIN_MESSAGE);
					messageTextField.setEditable(true);
					messegeSendButton.setEnabled(true);
					
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		connectionButton.setBounds(354, 74, 164, 21);
		mainPanel.add(connectionButton);
		
		//<<접속자>
		JScrollPane connetedUserListScrollPane = new JScrollPane();
		connetedUserListScrollPane.setBounds(354, 105, 164, 284);
		mainPanel.add(connetedUserListScrollPane);
		
		JList connectedUserList = new JList();
		connetedUserListScrollPane.setViewportView(connectedUserList);
		
		
	
		//<<메세지입력 및 전송>>
		messageTextField = new JTextField();
		messageTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				System.out.println("전송");
				
			}
		});
		messageTextField.setBounds(12, 399, 397, 45);
		messageTextField.setEditable(false);
		mainPanel.add(messageTextField);
		messageTextField.setColumns(10);
		
		messegeSendButton = new JButton("전송");
		messegeSendButton.setBounds(421, 399, 97, 41);
		messegeSendButton.setEnabled(false);
		mainPanel.add(messegeSendButton);
		
		
	}
}
