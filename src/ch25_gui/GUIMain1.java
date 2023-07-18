package ch25_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;

public class GUIMain1 extends JFrame {  //JFrame
	
	private final String ADMIN_USERNAME = "admin";   //관리자 정보는 바뀔일이 없어서 final(상수)
	private final String ADMIN_PASSWORD = "1234";

	private CardLayout mainCardLayout;
	
	private JPanel mainCardPanel;
	private JPanel loginPanel;
	private JPanel homePanel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GUIMain1 frame = new GUIMain1();
					frame.setVisible(true);
	}
			

	/**
	 * Create the frame.
	 */
	public GUIMain1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 450, 300);      // 노출면  (좌표,  좌표,  가로,  세로)
		mainCardPanel = new JPanel();
		mainCardLayout = new CardLayout();
		mainCardPanel.setLayout(mainCardLayout);
		setContentPane(mainCardPanel);
		
		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		loginPanel.setLayout(null);
		mainCardPanel.add(loginPanel,"loginPanel");
		
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(60, 70, 333, 31);
		loginPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(60, 111, 333, 31);
		loginPanel.add(passwordField);
		passwordField.setColumns(10);

		
		
		
		JButton signinBtn = new JButton("Login");
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 				//admin 설정값과 입력값이 같은지의 확인여부. ▼
				String username = usernameTextField.getText();   
				String password = passwordField.getText();
				if(!username.equals(ADMIN_USERNAME) || !password.equals(ADMIN_PASSWORD)) {
					JOptionPane.showMessageDialog(null,"사용자정보가 일치하지않습니다.","로그인 실패",JOptionPane.ERROR_MESSAGE);   //오류 팝업메세지.(plan, warning, information, error)
					System.out.println("사용자정보가 일치하지않습니다.");
					return;
			}
				JOptionPane.showMessageDialog(loginPanel,"환영합니다.","로그인 성공",JOptionPane.PLAIN_MESSAGE);  //로그인 성공 팝업
				mainCardLayout.show(mainCardPanel, "homePanel");
			}													  //admin 설정값과 입력값이 같은지의 확인여부. ▲
		});
		signinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signinBtn.setBounds(172, 177, 97, 23);
		loginPanel.add(signinBtn);
		
		homePanel = new JPanel();
		homePanel.setLayout(null);
		mainCardPanel.add(homePanel, "homePanel");
		
				
	
	}
}
