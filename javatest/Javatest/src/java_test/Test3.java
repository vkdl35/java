package java_test;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test3 extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	
	JProgressBar progress;
	JLabel lb8;
	JPanel panel_3;
	JLabel lb10;
	JLabel lb11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test3 frame = new Test3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 58, 568, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton place1 = new JRadioButton("\uB0A8\uC591\uC8FC");
		place1.setSelected(true);
		place1.setBounds(6, 6, 115, 23);
		panel.add(place1);
		
		JRadioButton place2 = new JRadioButton("\uCDA9\uBD81\uC74C\uC131");
		place2.setBounds(201, 6, 115, 23);
		panel.add(place2);
		
		JRadioButton place3 = new JRadioButton("\uCD98\uCC9C");
		place3.setBounds(390, 6, 115, 23);
		panel.add(place3);
		
		ButtonGroup gr = new ButtonGroup();
		gr.add(place1);
		gr.add(place2);
		gr.add(place3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 127, 568, 38);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		tf1 = new JTextField();
		tf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tf1.setBounds(78, 10, 96, 21);
		panel_1.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(402, 10, 96, 21);
		panel_1.add(tf2);
		tf2.setColumns(10);
		
		JLabel lb4 = new JLabel("\uC131\uC778 : ");
		lb4.setBounds(18, 13, 50, 15);
		panel_1.add(lb4);
		
		JLabel lb5 = new JLabel("\uCCAD\uC18C\uB144(\uB9CC 10\uC138 \uC774\uC0C1) :");
		lb5.setBounds(247, 13, 134, 15);
		panel_1.add(lb5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 200, 568, 53);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		tf3 = new JTextField();
		tf3.setBounds(94, 10, 117, 21);
		panel_2.add(tf3);
		tf3.setColumns(10);
		
		JLabel lb7 = new JLabel("\uCEA0\uD551\uC77C\uC790 : ");
		lb7.setBounds(10, 13, 76, 15);
		panel_2.add(lb7);
		
		JLabel lblNewLabel = new JLabel("\uC608\uC2DC) 2022-06-24");
		lblNewLabel.setBounds(270, 13, 110, 15);
		panel_2.add(lblNewLabel);
		
		this.progress = new JProgressBar();
		this.progress.setBounds(10, 263, 402, 30);
		contentPane.add(this.progress);
		
		JButton btn = new JButton("\uC608\uC57D\uD558\uAE30");
		
		btn.setBounds(444, 263, 134, 30);
		contentPane.add(btn);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setVisible(false);
		panel_3.setBounds(10, 352, 568, 63);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lb10 = new JLabel();
		lb10.setBounds(40, 10, 268, 15);
		panel_3.add(lb10);
		
		lb11 = new JLabel();
		lb11.setBounds(39, 35, 241, 15);
		panel_3.add(lb11);
		
		JLabel lb1 = new JLabel("\uCEA0\uD551\uC7A5 \uC608\uC57D \uC2DC\uC2A4\uD15C");
		lb1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lb1.setBounds(10, 10, 157, 15);
		contentPane.add(lb1);
		
		JLabel lb2 = new JLabel("\uCEA0\uD551 \uC7A5\uC18C\uB97C \uC120\uD0DD\uD558\uC138\uC694");
		lb2.setBounds(10, 33, 170, 15);
		contentPane.add(lb2);
		
		JLabel lb3 = new JLabel("\uC778\uC6D0\uC218\uB97C \uC785\uB825\uD558\uC138\uC694");
		lb3.setBounds(10, 102, 124, 15);
		contentPane.add(lb3);
		
		JLabel lb6 = new JLabel("\uCEA0\uD551 \uB0A0\uC9DC \uC785\uB825");
		lb6.setBounds(10, 175, 91, 15);
		contentPane.add(lb6);
		
		JButton cbtn = new JButton("\uC885\uB8CC");
		cbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cbtn.setBounds(465, 425, 113, 30);
		contentPane.add(cbtn);
		
		this.lb8 = new JLabel("\uC7A0\uC2DC\uB9CC \uAE30\uB2E4\uB824 \uC8FC\uC138\uC694...");
		lb8.setVisible(false);
		this.lb8.setBounds(134, 303, 200, 15);
		contentPane.add(this.lb8);
		
		JLabel lb9 = new JLabel("\uD655\uC778 \uBC0F \uC785\uAE08\uD558\uC2E4 \uAE08\uC561");
		lb9.setBounds(10, 328, 157, 15);
		contentPane.add(lb9);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Timer t = new Timer();
				TimerTask task = new TimerTask() {
					
					@Override
					public void run() {
						pstart();		
						panel_3.setVisible(true);
						lb10.setText("일자 및 장소 :" +place1.getText()+tf3.getText()+"성인:"+tf1.getText()+", 청소년:"+tf2.getText());
						

					}
				};
				t.schedule(task, 600);
			}
		});
		
		
		
	}
	
	public void pstart() {
		int w = 0;
		try {
			while(w <= 100) {
				this.progress.setValue(w);
				Thread.sleep(10);
				w++;
				lb8.setVisible(true);
			}
		}
		catch (Exception h) {
			System.out.println("오류발생");
		}

		if(this.progress.getValue()==50) {
			
			this.lb8.setText("잠시만 기다려 주세요.");
		}
		
		else if(this.progress.getValue()==100) {
			this.lb8.setText("완료");
		}
	}	
}
