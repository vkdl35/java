import java.awt.*;

public class awt3 {
	//abstract���� awt �ε�
	public static void main(String[] args) {
		
		popup p = new popup();
		p.design("awt ���� Ÿ��Ʋ");
//		popup2 p2 = new popup2();
//		p2.design("awt ���� ������ �ι�°");
		

	}

}

abstract class design {
	Frame fr = new Frame();
	public void design(String title) {
		this.fr.setTitle(title);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(500, 300, 300, 300);
	}
	public abstract void page();
}

class popup2 extends design{
	@Override
public void page() {
		
	}
}
class popup extends design{
	@Override
	public void page() {
		
	}
}
