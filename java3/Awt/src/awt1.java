import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/*
		GUI ��� : (Java7) AWT(abstract window ����Ʋ), SWING( AWT-�׷��� )
		CUI ��� : Scanner
		
		SWING : JFrame -> Jpanel -> JObject
	*/
	public static void main(String[] args) {
		//awt �������
		//Frame -> panel -> object (����)
		//Object -> panel -> Frame (����)
		
		popclose pc = new popclose();
		
		Frame fr = new Frame();	//������ â
		fr.setTitle("����� �α���");	//â �̸�
		fr.setSize(600,300);	//â ũ��
		fr.setVisible(true);	//��� ����
		fr.addWindowListener(pc);	//awt �޼ҵ带 ��ӹ޾Ƽ� ó��
		Panel pa = new Panel();	//�г�
		
		
		
		CheckboxGroup radio = new CheckboxGroup();	//üũ�ڽ� �׷� ����
		
		TextField id = new TextField(10);	//TextField 10�ڱ��� �Է�
		TextField pw = new TextField(10);
		TextField sa = new TextField("�����ȣ�� �Է��ϼ���.");	//�Է� �����Ͱ� �̸� �����
		Button b1 = new Button("�α���");	//Object ��ư
		
		Checkbox c1 = new Checkbox("�ڵ� �α���");
		Checkbox c2 = new Checkbox("������",true,radio);
		Checkbox c3 = new Checkbox("���Ǿ���",false,radio);
		
		
		pa.add(id);
		pa.add(pw);
		pa.add(sa);
		pa.add(c1);
		pa.add(c2);
		pa.add(c3);
		pa.add(b1);	//add �߰� ������Ʈ > �г�
		fr.add(pa);	//�г� > ������
		
		
	}

}

class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		System.gc();
	}
}
