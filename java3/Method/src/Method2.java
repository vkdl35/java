
public class Method2 {

	public static void main(String[] args) {
		//default package를 사용시 해당 class명을 호출하면됨
		/*	//단 package로 묶여있을 경우 제일 상단에 package를 선언해야함
		tests ts = new tests();
		ts.a2++;
		System.out.println(ts.a2 );
		*/
		info i = new info();
		/* error */
		//System.out.println(i.data1(20));
		//System.out.println(i.data2(20));
		
		/* success */
		System.out.println(i.data3(20));
		String result = i.data4("홍길동");
		/* data4 메소드 return 값을 result 변수로 받아서 처리 */
		System.out.println(result);
	}

}
class info {
	/* static 또는 void 메소드에는 return이라는 명령어를 사용하지 못함*/
	public static void data1(int ii) {
		int z = ii+20;
		//System.out.println(z);
		//return z;
	}
	public void data2(int ii) {
		int z = ii+20;
		//System.out.println(z);
		//return z;
	}
	public int data3(int ii) {	
		/* 자료형 메소드라고 말하며, 무조건 return 사용 해야합니다. 
	 		단, sysout을 사용하지 못합니다.*/
		int z = ii+20;
		return z;
		//자료 형태의 return 메소드
	}
	public String data4(String ii) {
		String z = ii + "님 환영합니다.";
		return z;
	}
}