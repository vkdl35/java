import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class awt7 {
	Checkbox ck = null;
	static boolean agree;
	public static void main(String[] args) {
		
		Frame fe = new Frame();
		fe.setBounds(300, 200, 350, 180);
		fe.setLayout(null);
		fe.setVisible(true);
		
		Checkbox ck = new Checkbox("Y");
		Choice se = new Choice();
		
		ck.setBounds(30, 50, 30, 30);
		se.setBounds(30, 100, 100, 30);
		
		se.add("SKT");
		se.add("KT");
		se.add("LGT");
		se.add("알뜰폰");
		
		fe.add(ck);
		fe.add(se);
		/* addItemListener : Checkbox, Choice에서 사용함 */
		ck.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
//				String checks = (String)e.getItem();
//				System.out.println(checks);
				
				if(e.getStateChange()==1) {
					agree = true;
					//System.out.println("동의하셨습니다.");
				}
				else {
					agree = false;
					//System.out.println("동의를 해야합니다.");
				}
				//System.out.println(e.getStateChange());
				//1 : check / 2 : uncheck
				System.out.println(agree);
				
			}
		});
		
		se.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String change = (String)e.getItem();
				System.out.println(change);
				
			}
		});
		
		

	}

}
