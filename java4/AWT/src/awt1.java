import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

	
	public awt1() {
	}
	
	public static void main(String[] args) {
		//Frame > Bound > Object
		Frame fr = new Frame(); //â
		
		fr.setTitle("AWT ���� ȭ��");
		fr.setVisible(true);
		fr.setBounds(150,150,500,500);	//(ȭ�� x��, ȭ�� y��, ����ũ��, ����ũ��)
		fr.setLayout(null); 	//�г��� ��� ����
		
		Button btn = new Button("Ŭ��");
		Button clasebtn = new Button("�ݱ�");
		Label msg = new Label("");
		//msg.setBackground(Color.BLUE);	//setBackground(Color.BLUE) ���� �Է�
		btn.setBounds(40, 40, 100, 30);
		clasebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);
		
		//Object�� Frame�� �����ϰ� �˴ϴ�
		fr.add(msg);
		fr.add(btn);
		fr.add(clasebtn);
		//addActionListener(��ư) : �̺�Ʈ �޼ҵ�. ��, this ��� �ȵ�
		clasebtn.addActionListener(new ActionListener() {	//new ActionListener() : Override �޼ҵ� �ڵ�����
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btn.addActionListener(new ActionListener() {
			String a = "�ȳ�";	//addActionListener : �̺�Ʈ �޼ҵ� �ʵ忡 string�� ����
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);	//this�� �̿��Ͽ� �ڵ鸵 ������
			}
		});
		
		
		
	}

}
