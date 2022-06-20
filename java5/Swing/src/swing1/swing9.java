package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
	//jEditorPane은 게시판 내용 출력 또는 입력 등 사용이 되며,
	//하이브리드 웹앱에서는 HTML을 로드하여 출력할 수도 있습니다.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
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
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 800, 800);
		setTitle("하이브리드 웹 앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 768, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html");	
		//ContentType : 문자와 HTML 코드도 사용
		webpage.setText("<h1>DOG~~</h1>"
				+ "<a href='https://www.vipah.co.kr/kr/index.php' target='_blank'><img src='https://t1.daumcdn.net/cfile/tistory/24283C3858F778CA2E'>"
				+ "DOG CUTE~"
				+ "<br><input type='text' id='name'>"
				);
		
		
		
	}
}
