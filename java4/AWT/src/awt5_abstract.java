//AWT ȯ�漳��
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
		
		this.bt = new Button("�ߺ�üũ");
		this.close = new Button("����");
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
		
		this.click();	//awt ������ �Ϸ� ��, �ش� �ڵ鸵 �޼ҵ�� �̵�
		
	}
	
	public void click() {

		/* �ߺ� Ȯ�� ��ư */
		this.bt.addActionListener(new ActionListener() {
			// setText(���), getText(�Է°� ��������)
			@Override
			public void actionPerformed(ActionEvent e) {
				// awt5_abstract.this.msg.setText("üũ�Ϸ�");
				String userid = awt5_abstract.this.mid.getText();
				if (userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���.");
				} else {
					idcheck(userid);
					String result = signok();
					if (result == null) {
						msg.setText("��� ������ ���̵��Դϴ�.");
					} else {
						msg.setText("�ٸ� ���̵� �Է����ּ���.");
					}
				}

			}
		});
		/* ���� ��ư */
		this.close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
