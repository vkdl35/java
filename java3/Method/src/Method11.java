import App.App1;	//다른 package를 로드시 import하여 사용함
//외부 package에서 App1.java 파일을 로드 및 기본 파일을 로드하여 사용합니다.
public class Method11 {

	public static void main(String[] args) {
		
		App1 b = new App1();	//main메소드를 로드하게 됩니다.
		//b.main(args);
		//다른 파일에 있는 main class를 불러올 때 sysout 사용불가(해당 class main에서 사용해야함)
		b.abox();	//main 메소드 안에서 abox라는 void 메소드를 로드하는 부분
	}

}
