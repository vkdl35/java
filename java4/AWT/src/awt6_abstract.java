
//awt6.java 연동
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

		this.bt = new Button("인증번호발송");
		this.ckbt = new Button("인증확인");
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

		// 인증번호발송
		this.bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				db();

			}
		});

		// 인증확인
		this.ckbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// awt6_abstract.this.msg.setText("체크완료");
				String user = awt6_abstract.this.text.getText();
				if (user.equals("")) {
					msg.setText("인증번호를 입력하세요.");
				} else {
					try {
						int number = Integer.parseInt(user);
						num(number);

						boolean dfe = k();
						if (dfe == true) {
							msg.setText("인증이 완료 되었습니다.");
						} else {
							msg.setText("인증번호를 다시 확인하시기 바랍니다.");
						}
					} catch (Exception t) {
						msg.setText("숫자만 입력 가능합니다.");
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
