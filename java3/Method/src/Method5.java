
public class Method5 {

	public static void main(String[] args) {
		
		cdb c = new cdb();
		/*
		c.d1 = "홍길동";
		c.data2();
		c.d3 = "이순신";
		c.data1();
		c.d3= "유관순";
		System.out.println(c.data3());
		*/
		
		//c.d2 = "강감찬"; /* private으로 선언한 객체이므로 main class에서 로드 못함 */
		c.data2("강감찬");
		String result = c.data3();
		System.out.println(result);
		c.data1(); //static은 웬만하면 다 안된다고
	}

}

class cdb{ 
	String d1 = null;	/* void, 자료형 메소드 로드 가능 */
	private String d2;	//외부 class에서 private에 직접적으로 데이터를 넣을 수 없음
	public static String d3;	/* 전부 사용 가능 */
	public static void data1() {	/* static 자료형 외에는 로드가 불가능함 */
		//System.out.println(d3);
		//**System.out.println(this.d2);	//static은 this 사용 불가능(void와 public만 사용 가능)
		String d1 = "홍길동";	//string을 강제로 달아줘야만 출력 가능
		System.out.println(d1);
		
	}
	public void data2(String user) {
		//System.out.println(d1);		
		this.d2 = user;	//받아서 처리해야함
		System.out.println(this.d2);	//this를 안써도 출력은 됨		
	}
	public String data3() {
		//String a = "";
		String a = this.d2;
		return a;
	}
}