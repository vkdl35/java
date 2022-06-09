import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {
	/*
		GUI 모드 : (Java7) AWT(abstract window 도구틀), SWING( AWT-그래픽 )
		CUI 모드 : Scanner
		
		SWING : JFrame -> Jpanel -> JObject
	*/
	public static void main(String[] args) {
		//awt 생성방식
		//Frame -> panel -> object (생성)
		//Object -> panel -> Frame (적용)
		
		popclose pc = new popclose();
		
		Frame fr = new Frame();	//프레임 창
		fr.setTitle("사용자 로그인");	//창 이름
		fr.setSize(600,300);	//창 크기
		fr.setVisible(true);	//사용 유무
		fr.addWindowListener(pc);	//awt 메소드를 상속받아서 처리
		Panel pa = new Panel();	//패널
		
		
		
		CheckboxGroup radio = new CheckboxGroup();	//체크박스 그룹 설정
		
		TextField id = new TextField(10);	//TextField 10자까지 입력
		TextField pw = new TextField(10);
		TextField sa = new TextField("사원번호를 입력하세요.");	//입력 데이터가 미리 적용됨
		Button b1 = new Button("로그인");	//Object 버튼
		
		Checkbox c1 = new Checkbox("자동 로그인");
		Checkbox c2 = new Checkbox("동의함",true,radio);
		Checkbox c3 = new Checkbox("동의안함",false,radio);
		
		
		pa.add(id);
		pa.add(pw);
		pa.add(sa);
		pa.add(c1);
		pa.add(c2);
		pa.add(c3);
		pa.add(b1);	//add 추가 오브젝트 > 패널
		fr.add(pa);	//패널 > 프레임
		
		
	}

}

class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent a) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		System.gc();
	}
}
