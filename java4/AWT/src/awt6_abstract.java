
//awt6.java ����
import java.awt.*;
import java.awt.event.*;

public abstract class awt6_abstract {

	public abstract boolean k(); // getter

	public abstract void num(int a); // setter

	public abstract void db();

	Frame f = new Frame();
	Label msg = new Label();
	Button bt = null;
	Button ckbt = null;
	Button close = null;
	TextField text = null;

	public void dy() {

		this.f.setBounds(300, 200, 350, 180);
		this.f.setLayout(null);
		this.f.setVisible(true);

		this.bt = new Button("������ȣ�߼�");
		this.ckbt = new Button("����Ȯ��");
		this.close = new Button("X");
		this.text = new TextField();

		this.bt.setBounds(20, 40, 100, 25);
		this.ckbt.setBounds(230, 76, 100, 25);
		this.close.setBounds(300, 40, 30, 25);
		this.text.setBounds(20, 76, 196, 25);
		this.msg.setBounds(20, 110, 250, 25);

		this.f.add(bt);
		this.f.add(ckbt);
		this.f.add(close);
		this.f.add(text);
		this.f.add(msg);

		ct();

	}

	public void ct() {

		// ������ȣ�߼�
		this.bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				db();

			}
		});

		// ����Ȯ��
		this.ckbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// awt6_abstract.this.msg.setText("üũ�Ϸ�");
				String user = awt6_abstract.this.text.getText();
				if (user.equals("")) {
					msg.setText("������ȣ�� �Է��ϼ���.");
				} else {
					try {
						int number = Integer.parseInt(user);
						num(number);

						boolean dfe = k();
						if (dfe == true) {
							msg.setText("������ �Ϸ� �Ǿ����ϴ�.");
						} else {
							msg.setText("������ȣ�� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�.");
						}
					} catch (Exception t) {
						msg.setText("���ڸ� �Է� �����մϴ�.");
					}
				}

			}
		});

		this.close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
