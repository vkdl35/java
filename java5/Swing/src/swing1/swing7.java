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
				
		JRadioButton rd1 = new JRadioButton("�ſ�ī��");
		rd1.setName("CARD");
		rd1.setSelected(true);
		rd1.setFont(rd1.getFont().deriveFont(12f));
		rd1.setBounds(38, 5, 108, 23);
		panel.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("������ü");
		rd2.setName("BANK");
		rd2.setAlignmentX(Component.CENTER_ALIGNMENT);
		rd2.setBounds(161, 5, 96, 23);
		panel.add(rd2);
		
		JRadioButton rd3 = new JRadioButton("������ �Ա�");
		rd2.setName("NOBANK");	//setName�� ������� ������, background���� �ش� �Ӽ��� ���� �����ϴ� ���� ���մϴ�.
		rd3.setBounds(277, 5, 115, 23);
		panel.add(rd3);
		
		ButtonGroup gp = new ButtonGroup();	//radio ���� ButtoGroup�� �̿�
		gp.add(rd1);
		gp.add(rd2);
		gp.add(rd3);
		
		
		JButton btn = new JButton("���� ����");
		btn.setBounds(164, 76, 112, 40);
		contentPane.add(btn);
		
		JPanel mu = new JPanel();
		mu.setVisible(false);
		mu.setToolTipText("test");
		mu.setBounds(10, 148, 418, 107);
		contentPane.add(mu);
		mu.setBorder(new TitledBorder("������ �Ա�"));
		mu.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 21, 105, 32);
		mu.add(textField);
		textField.setColumns(10);	
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pay = "";
				if(rd1.isSelected()==true) {	//�ſ�ī��
					pay = rd1.getName();
					System.out.println("�ſ�ī�� ����");
					mu.setVisible(false);
				}
				else if(rd2.isSelected()==true) {	//������ü
					System.out.println("������ü ����");
					mu.setVisible(false);
				}
				else {	//������
					mu.setVisible(true);
				}
				
			}
		});
		
		
		
		
		}
}
