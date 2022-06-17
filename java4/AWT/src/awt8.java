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
		Button btn = new Button("�˻�");
		search.setBounds(10, 30, 150, 25);
		btn.setBounds(200, 30, 80, 25);
		fe.add(search);
		fe.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sh = search.getText();
				if(sh.equals("")) {
					System.out.println("�˻�� �Է����ּ���.");
				}
				else {
					try {
						//Desktop.getDesktop().browse : awt���� �ü�� ȯ�濡 �ִ� �⺻ ������ �� Edge�� ����ϰ� �˴ϴ�.
						//URI : java.net API�Լ� (��Ʈ��ũ ��Ʈ�Դϴ�.) - ��� �ܿ� �Ķ���Ͱ��� ���մϴ�.
						//URL : ?�ڿ� �ٴ� �Ķ���Ͱ�
						Desktop.getDesktop().browse(new URI("http://search.naver.com/search.naver?query="+sh));
					}
					catch (Exception i) {
						System.out.println("URL ���� �߻�");
					}
				}
				
			}
		});
		

	}

}
