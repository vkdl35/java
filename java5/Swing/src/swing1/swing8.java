package swing1;

import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

//progress바 사용법

public class swing8 extends JFrame {

	JProgressBar progress;
	JLabel Lb;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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
	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(50, 28, 346, 24);
		contentPane.add(this.progress);
		
		this.Lb = new JLabel("");
		this.Lb.setBounds(55, 83, 340, 15);
		contentPane.add(this.Lb);
		
		//swing 프로그램이 작동 후 해당 메소드로 1초 후 실행 되도록 적용함
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				pstart();				
			}
		};
		t.schedule(task, 100);
		
		
	}
	
	public void pstart() {
		int w = 0;
		try {
			while(w <= 100) {
				this.progress.setValue(w);	//setValue : 해당 기본 값을 말합니다.
				Thread.sleep(10);
				w++;
				//this.Lb.setText("다운로드가 완료 되었습니다.");
			}
		}
		catch (Exception h) {
			System.out.println("오류발생");
		}
		if(this.progress.getValue()==100) {
			this.Lb.setText("다운로드가 모두 완료되었습니다.");
		}
	}	
	
}
