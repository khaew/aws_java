package ch26_socket.simpleGUI.client;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Objects;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ch26_socket.simpleGUI.client.dto.RequestBodyDto;
import ch26_socket.simpleGUI.client.dto.SendMessage;
import lombok.Getter;

@Getter
public class SimpleGUIClient extends JFrame {

	/*
	 *
	 * 
	 * 1. 방나가기 2. 접속자 떠야함 3. 방제목 떠야함 4. 나가기버튼(나가면 방리스트) 5. 방장은 참여자 이름 옆에 방장이라고 떠야함
	 * 6. 방장 나가면 모두 퇴출 7. 텍스트필드 옆 왼쪽에 전체>>더블클릭하면 그사람의 이름이 나오고 해당사람에게만 메세지
	 * (toUserName) >> 메세지 보내고나면 다시 전체로 바뀜.
	 *
	 */

	/*
	 * 방만들기, 방목록띄우기 // 방장왕관씌우기, 방나가기 ,귓속말기능
	 * 
	 */

	private static SimpleGUIClient instance; // 싱글톤. 롬복 게터생성. instance, static

	public static SimpleGUIClient getInstance() {
		if (instance == null) {
			instance = new SimpleGUIClient();
		}
		return instance;
	}

	private String username;
	private Socket socket;

	private CardLayout mainCardLayout;
	private JPanel mainCardPanel;

	private JPanel chattingRoomListPanel;
	private JScrollPane roomListScrollPanel;
	private DefaultListModel<String> roomListModel;
	private JList roomList;

	private JPanel chattingRoomPanel;
	private JTextField chattingText;
	private JTextArea chattingTextArea;
	private JScrollPane userListScrollPane;
	private DefaultListModel<String> userListModel;
	private JList userList;

	// 접속 - connectedSocket - username

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGUIClient frame = SimpleGUIClient.getInstance();
					frame.setVisible(true);

					ClientReceiver clientReceiver = new ClientReceiver();
					clientReceiver.start();

					RequestBodyDto<String> requestBodyDto = new RequestBodyDto<String>("connection", frame.username);
					ClientSender.getInstance().send(requestBodyDto);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SimpleGUIClient() {

		username = JOptionPane.showInputDialog(chattingRoomPanel, "아이디를 입력하세요.");

		// 아이디 미입력시 탈출
		if (Objects.isNull(username)) {
			System.exit(0);
		}

		if (username.isBlank()) {
			System.exit(0);
		}

		try {
			socket = new Socket("127.0.0.1", 8080);

		} catch (UnknownHostException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		mainCardLayout = new CardLayout();
		mainCardPanel = new JPanel();
		mainCardPanel.setLayout(mainCardLayout);
		setContentPane(mainCardPanel);
//////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////
		chattingRoomListPanel = new JPanel();
		chattingRoomListPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		chattingRoomListPanel.setLayout(null);
		mainCardPanel.add(chattingRoomListPanel, "chattingRoomListPanel");

		JButton createRoomButton = new JButton("방만들기");
		createRoomButton.setBounds(10, 10, 100, 30);
		createRoomButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String roomName = JOptionPane.showInputDialog(chattingRoomListPanel, "방제목을 입력하세요.");

				if (Objects.isNull(roomName)) {
					return;
				}
				if (roomName.isBlank()) {
					JOptionPane.showMessageDialog(chattingRoomListPanel, "방제목을 입력하세요.", "방만들기 실패",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				for (int i = 0; i < roomListModel.size(); i++) {
					if (roomListModel.get(i).equals(roomName)) {
						JOptionPane.showMessageDialog(chattingRoomListPanel, "이미 존재하는 방제목입니다.", "방만들기 실패",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

				}

				RequestBodyDto<String> requestBodyDto = new RequestBodyDto<String>("createRoom", roomName);
				ClientSender.getInstance().send(requestBodyDto);

			}
		});
		chattingRoomListPanel.add(createRoomButton);

		roomListScrollPanel = new JScrollPane();
		roomListScrollPanel.setBounds(12, 69, 410, 182);
		chattingRoomListPanel.add(roomListScrollPanel);

		roomListModel = new DefaultListModel<String>();
		roomList = new JList(roomListModel);
		roomList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (e.getClickCount() == 2) { // 더블클릭을 받아서 선택된 방의 인덱스(순서) 가져오는 원리.
					String roomName = roomListModel.get(roomList.getSelectedIndex()); // 방이름 가져오기
					mainCardLayout.show(mainCardPanel, "chattingRoomPanel");
//===================================================================================================
//===================================================================================================
					RequestBodyDto<String> requestBodyDto = new RequestBodyDto<String>("join", roomName);
					ClientSender.getInstance().send(requestBodyDto);

				}
			}
		});
		roomListScrollPanel.setViewportView(roomList);

		chattingRoomPanel = new JPanel();
		chattingRoomPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		chattingRoomPanel.setLayout(null);
		mainCardPanel.add(chattingRoomPanel, "chattingRoomPanel");

		JScrollPane chattingTextAreaScrollPane = new JScrollPane();
		chattingTextAreaScrollPane.setBounds(12, 10, 313, 203);
		chattingRoomPanel.add(chattingTextAreaScrollPane);

		chattingTextArea = new JTextArea();
		chattingTextAreaScrollPane.setViewportView(chattingTextArea);

		chattingText = new JTextField();
		chattingText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					SendMessage sendMessage = SendMessage.builder().fromUsername(username)
							.messageBody(chattingText.getText()).build();

					RequestBodyDto<?> requestBodyDto = new RequestBodyDto<>("sendMessage", sendMessage);

					ClientSender.getInstance().send(requestBodyDto);
					chattingText.setText("");
				}
			}
		});
		chattingText.setBounds(12, 223, 410, 28);
		chattingRoomPanel.add(chattingText);
		chattingText.setColumns(10);

		userListScrollPane = new JScrollPane();
		userListScrollPane.setBounds(337, 10, 85, 203);
		chattingRoomPanel.add(userListScrollPane);

		userListModel = new DefaultListModel<>();
		userList = new JList(userListModel);
		userListScrollPane.setViewportView(userList);

	}
}