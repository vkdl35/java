import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class awt8 {
	TextField search = null;
	public static void main(String[] args) {
		
		Frame fe = new Frame();
		fe.setBounds(300, 200, 350, 180);
		fe.setLayout(null);
		fe.setVisible(true);
		TextField search = new TextField();
		Button btn = new Button("검색");
		search.setBounds(10, 30, 150, 25);
		btn.setBounds(200, 30, 80, 25);
		fe.add(search);
		fe.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sh = search.getText();
				if(sh.equals("")) {
					System.out.println("검색어를 입력해주세요.");
				}
				else {
					try {
						//Desktop.getDesktop().browse : awt에서 운영체제 환경에 있는 기본 브라우저 중 Edge를 사용하게 됩니다.
						//URI : java.net API함수 (네트워크 파트입니다.) - 경로 외에 파라미터값을 말합니다.
						//URL : ?뒤에 붙는 파라미터값
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
					}
					catch (Exception i) {
						System.out.println("URL 오류 발생");
					}
				}
				
			}
		});
		

	}

}
