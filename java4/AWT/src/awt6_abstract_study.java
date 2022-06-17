import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public abstract class awt6_abstract_study {

	static String pc = "";

	public abstract void setter(String userno);

	public abstract String getter();

	Frame fr = new Frame();
	Label msg3 = new Label();
	Button bt = null;
	Button bt2 = null;
	Button close = null;
	TextField mid = null;

	public void design2() {

		this.fr.setBounds(300, 200, 350, 180);
		this.fr.setLayout(null);
		this.fr.setVisible(true);

		this.bt = new Button("인증번호발송");
		this.bt2 = new Button("인증확인");
		this.close = new Button("X");
		this.mid = new TextField();

		this.bt.setBounds(20, 40, 100, 25);
		this.bt2.setBounds(230, 76, 100, 25);
		this.close.setBounds(300, 40, 30, 25);
		this.mid.setBounds(20, 76, 196, 25);
		this.msg3.setBounds(20, 110, 250, 25);

		this.fr.add(bt);
		this.fr.add(bt2);
		this.fr.add(close);
		this.fr.add(mid);
		this.fr.add(msg3);

		this.click2();

	}

	public void click2() {

		this.close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// 인증번호발송
		this.bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random ra = new Random();
				pc = "";
				for (int f = 1; f < 5; f++) {
					pc += String.valueOf(ra.nextInt(10));
				}
				System.out.println(pc);
			}
		});
		// 인증확인
		this.bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (awt6_abstract_study.this.mid.getText().equals("")) {
					msg3.setText("인증번호를 입력해주세요.");
				} else {
					setter(awt6_abstract_study.this.mid.getText());
					msg3.setText(getter());
				}
			}
		});

	}

}
