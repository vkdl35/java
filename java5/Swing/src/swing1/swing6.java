package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tel = new JTextField();

		tel.setFont(new Font("\uB3CB\uC6C0\uCCB4", tel.getFont().getStyle(), 12));
		tel.setBounds(26, 31, 250, 27);
		contentPane.add(tel);
		tel.setColumns(10);

		JButton btnNewButton = new JButton("\uC778\uC99D\uBC88\uD638 \uBC1B\uAE30");
		btnNewButton.setFont(
				new Font("\uB3CB\uC6C0\uCCB4", btnNewButton.getFont().getStyle(), btnNewButton.getFont().getSize()));
		btnNewButton.setBounds(286, 31, 130, 27);
		contentPane.add(btnNewButton);

		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED, 2));
		msg.setFont(new Font("\uB3CB\uC6C0\uCCB4", msg.getFont().getStyle(), msg.getFont().getSize()));
		msg.setBounds(26, 88, 388, 27);
		contentPane.add(msg);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		tel.addKeyListener(new KeyAdapter() { // 키를 누를경우 적용되는 이벤트 메소드
			// keyPressed : 키를 누를 때
			// keyReleased : 키를 눌렀다가 up이 되었을 때
			// keyTyped : 키 문자를 입력 받을 때
			@Override
			public void keyTyped(KeyEvent k) {
				//입력값에 대한 자리수
				int i = tel.getText().length();
				if(i > 10) {
					k.consume();
				}
				
				// System.out.println(k);
				// System.out.println(k.getKeyCode());

				int n = Integer.valueOf(k.getKeyChar()); // 아스키 코드로 변경됨
				if (n >= 48 && n <= 57) {
					// sysout에는 정상적인 문자 getKeyChar() 보이지만, Integer로 변경시 아스키 코드
					msg.setText("");
				} else {
					msg.setText("숫자만 입력하세요.");
					k.consume(); // keyTyped를 이용 consume는 해당 입력시 null로 간주됨
				}
			}
		});

	}

}
