import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt ����
public class awt2 {
	public static void main(String[] args) {
		login lg = new login();

	}

}
class loginok extends login {	//ȭ�� ��ȯ�ϴ� �ڽ� Ŭ����
	public loginok() {
		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(500, 300, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}

class login {	//������ > extends abstract(�߻� Ŭ����)�� ���� �ε��Ͽ� �ʵ忡 �����Ŵ
	Frame fr = new Frame();
	Font ft = new Font("����ü", Font.BOLD, 18); // ("����ü",Font.ȿ��,ũ��)
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button a1 = new Button("�α���");
	Button a2 = new Button("ȸ������");
	Button a3 = new Button("���α׷� ����");
	Label msg = new Label();
	Label msg2 = new Label();

	public login() {
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(500, 300, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

		mid.setFont(ft); // ���� �Ӽ��� �����ϰ����ϴ� ������Ʈ ����
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // ����ǥ ��ߵ�


		a1.setBackground(Color.pink); // �α���
		a2.setBackground(Color.BLUE); // ȸ������
		a3.setBackground(Color.DARK_GRAY); // ���α׷� ����

		mid.setBounds(100, 60, 200, 40);
		mpw.setBounds(100, 120, 200, 40);
		a1.setBounds(100, 180, 200, 40);
		a2.setBounds(100, 240, 200, 40);
		a3.setBounds(100, 300, 200, 40);
		
		
		msg.setBounds(100, 100, 200, 20);
		msg2.setBounds(100, 160, 200, 20);

		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(a1);
		this.fr.add(a2);
		this.fr.add(a3);
		this.fr.add(msg);
		this.fr.add(msg2);
		this.clicks();

	}

	public void clicks() { // ��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		
		this.a2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);	//�ش� ������ ����
				loginok ok = new loginok();	//���� ������ �ε�
				
			}
		});
		
		
		this.a3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		this.a1.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing API ���ɼ� �ε�

			@Override
			public void actionPerformed(ActionEvent e) {
				// �α��� ��ư ���̵� �� �н����� ����
				String user_id = mid.getText(); // Object��.getText ����ڰ� �Է��� ���� ������ �� ����մϴ�.
				if (user_id.equals("")) { // null ��� ���� -> null ���� ���� �ִ� ���¸� ����
					msg.setText("���̵� �Է��ϼ���.");
					// alert.showMessageDialog(null, "���̵� �Է��ϼ���."); //,"��� �޽���",JOptionPane.ERROR_MESSAGE
				} else {
					msg.setText("");
					String user_pw = mpw.getText();
					if (user_pw.equals("")) {
						msg2.setText("��й�ȣ�� �Է��ϼ���.");
					} else {
						msg2.setText("�α����� �����մϴ�.");
					}

				}
			}
		});
	}

}