package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

public class swing7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing7 frame = new swing7();
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
	public swing7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(10, 26, 418, 40);
		contentPane.add(panel);
		panel.setLayout(null);
				
		JRadioButton rd1 = new JRadioButton("신용카드");
		rd1.setName("CARD");
		rd1.setSelected(true);
		rd1.setFont(rd1.getFont().deriveFont(12f));
		rd1.setBounds(38, 5, 108, 23);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("계좌이체");
		rd2.setName("BANK");
		rd2.setAlignmentX(Component.CENTER_ALIGNMENT);
		rd2.setBounds(161, 5, 96, 23);
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("무통장 입금");
		rd2.setName("NOBANK");	//setName은 노출되지 않으며, background에서 해당 속성에 값을 적용하는 것을 말합니다.
		rd3.setBounds(277, 5, 115, 23);
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();	//radio 사용시 ButtoGroup를 이용
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		
		JButton btn = new JButton("결제 진행");
		btn.setBounds(164, 76, 112, 40);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setVisible(false);
		mu.setToolTipText("test");
		mu.setBounds(10, 148, 418, 107);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("무통장 입금"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 21, 105, 32);
		mu.add(textField);
		textField.setColumns(10);	
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pay = "";
				if(rd1.isSelected()==true) {	//신용카드
					pay = rd1.getName();
					System.out.println("신용카드 선택");
					mu.setVisible(false);
				}
				else if(rd2.isSelected()==true) {	//계좌이체
					System.out.println("계좌이체 선택");
					mu.setVisible(false);
				}
				else {	//무통장
					mu.setVisible(true);
				}
				
			}
		});
		
		
		
		
		}
}
