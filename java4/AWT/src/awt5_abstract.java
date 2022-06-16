//AWT 환경설정
import java.awt.*;
import java.awt.event.*;

public abstract class awt5_abstract {
	
	public abstract String signok();	//getter
	public abstract void idcheck(String id);	//setter
	public abstract void dataload();	//DataBase
	
	Frame fr = new Frame();
	Label msg = new Label();
	Button bt = null;
	Button close = null;
	TextField mid = null;
	
	public void desing() {
		this.fr.setBounds(500, 300, 300, 450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		
		this.bt = new Button("중복체크");
		this.close = new Button("종료");
		this.mid = new TextField();
		
		this.bt.setBackground(Color.lightGray);
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.close.setBackground(Color.lightGray);
		
		this.mid.setBounds(25, 60, 156, 25);
		this.bt.setBounds(190, 60, 80, 25);
		this.msg.setBounds(25, 100, 250, 25);
		this.close.setBounds(190, 390, 80, 25);
		
		this.fr.add(msg);
		this.fr.add(bt);
		this.fr.add(close);
		this.fr.add(mid);
		
		this.click();	//awt 디자인 완료 후, 해당 핸들링 메소드로 이동
		
	}
	
	public void click() {

		/* 중복 확인 버튼 */
		this.bt.addActionListener(new ActionListener() {
			// setText(출력), getText(입력값 가져오기)
			@Override
			public void actionPerformed(ActionEvent e) {
				// awt5_abstract.this.msg.setText("체크완료");
				String userid = awt5_abstract.this.mid.getText();
				if (userid.equals("")) {
					msg.setText("아이디를 입력하세요.");
				} else {
					idcheck(userid);
					String result = signok();
					if (result == null) {
						msg.setText("사용 가능한 아이디입니다.");
					} else {
						msg.setText("다른 아이디를 입력해주세요.");
					}
				}

			}
		});
		/* 종료 버튼 */
		this.close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
