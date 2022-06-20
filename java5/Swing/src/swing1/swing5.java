package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		/* Frame�� absolute ���·� layer�� �����մϴ�. */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mid = new JTextField();
		mid.setBounds(145, 13, 117, 21);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setAlignmentX(Component.CENTER_ALIGNMENT);
		msg.setBounds(10, 137, 418, 28);
		contentPane.add(msg);
		JButton btnNewButton_1 = new JButton("\uC544\uC774\uB514 \uCCB4\uD06C");
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(155, 44, 93, 23);
		contentPane.add(btnNewButton_1);

		/* �ڵ鸵 Ŭ������ ������Ʈ���� �����ڵ忡 ������ �ش� ������Ʈ�� �ε����� ���մϴ�. */
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mid.getText().equals("")) {
					msg.setText("���̵� �Է��ϼ���.");
				}
				else {
					int lg = mid.getText().length();	//�Է� ���� ����
					if(lg < 5) {
						msg.setText("���̵�� �ټ��� �̻� ��� �����մϴ�.");
					}
					else {
						msg.setText("���̵� ���� ���Դϴ�.");
					}
				}
			}
		});
		
	}
}
