import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class awt4_class {
	//Scanner sc = new Scanner(System.in);
	// awt4.java�� ����
	public void view() {
		decorate de = new decorate();	//awt4.java �ڽ� Ŭ���� �ε�
		Frame f = new Frame();

		Label lb = new Label();

		f.setBounds(500, 200, 300, 300);
		f.setVisible(true);
		f.setLayout(null);

		Button btn = new Button("���");
		Button closebtn = new Button("����");
		TextField input = new TextField();
		
		lb.setBackground(Color.gray);

		input.setBounds(50, 50, 100, 25);
		btn.setBounds(180, 50, 80, 25);
		closebtn.setBounds(50, 200, 80, 25);
		lb.setBounds(50, 100, 200, 100);
		
		f.add(input);
		f.add(btn);
		f.add(closebtn);
		f.add(lb);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int c = Integer.parseInt(input.getText());
					//lb.setText(de.btn_push(c));
					de.btn_push(c);
					 de.calls();
				}catch (Exception c) {
					lb.setText("���ڸ� �Է��ϼ���");
					
				}
				
				
			}
		});
		closebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
