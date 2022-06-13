import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

//외부 클래스로 awt 생성
public class awt2 {
	public static void main(String[] args) {
		login lg = new login();

	}

}
class loginok extends login {	//화면 전환하는 자식 클래스
	public loginok() {
		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(500, 300, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
	}
}

class login {	//연습용 > extends abstract(추상 클래스)를 먼저 로드하여 필드에 적용시킴
	Frame fr = new Frame();
	Font ft = new Font("돋움체", Font.BOLD, 18); // ("글자체",Font.효과,크기)
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button a1 = new Button("로그인");
	Button a2 = new Button("회원가입");
	Button a3 = new Button("프로그램 종료");
	Label msg = new Label();
	Label msg2 = new Label();

	public login() {
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(500, 300, 400, 400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

		mid.setFont(ft); // 글자 속성을 적용하고자하는 오브젝트 선택
		mpw.setFont(ft);
		mpw.setEchoChar('*'); // 따옴표 써야됨


		a1.setBackground(Color.pink); // 로그인
		a2.setBackground(Color.BLUE); // 회원가입
		a3.setBackground(Color.DARK_GRAY); // 프로그램 종료

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

	public void clicks() { // 버튼에 관한 모든 핸들링 메소드 집합소
		
		this.a2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);	//해당 프레임 종료
				loginok ok = new loginok();	//다음 프레임 로드
				
			}
		});
		
		
		this.a3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		this.a1.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); // swing API 경고옵션 로드

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText(); // Object명.getText 사용자가 입력한 값을 가져올 때 사용합니다.
				if (user_id.equals("")) { // null 사용 금지 -> null 또한 값이 있는 상태를 말함
					msg.setText("아이디를 입력하세요.");
					// alert.showMessageDialog(null, "아이디를 입력하세요."); //,"경고 메시지",JOptionPane.ERROR_MESSAGE
				} else {
					msg.setText("");
					String user_pw = mpw.getText();
					if (user_pw.equals("")) {
						msg2.setText("비밀번호를 입력하세요.");
					} else {
						msg2.setText("로그인을 진행합니다.");
					}

				}
			}
		});
	}

}