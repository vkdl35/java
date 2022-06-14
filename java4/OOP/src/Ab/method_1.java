package Ab;

import java.util.Arrays;
//method_1a.java
public class method_1 {
	
	public void recall() {	//Ab2 패키지와 공유설정 메소드
		//package Ab2에서 import 할 수 있도록하며, 외부 클래스도 동일하게 모두 가져오게함
		System.out.println("test");
	}
	protected static void name() {	//protected static을 적용해야만 Ab2 패키지와 공유 가능
		System.out.println("lee");
	}

	public static void main(String[] args) {
		/* Arrays.sort : 배열 오름차순 정렬 (숫자,한글,영문) 
		   단, 영문일 경우 대문자가 제일 먼저 오름차순으로 정렬됩니다. */
		
		/*
		int number_data[] = {5,7,1,4,9,2};
		Arrays.sort(number_data);	//오름차순으로 데이터 정렬
		System.out.println(Arrays.toString(number_data));	//출력 순서 중요
		
		String user_data[] = {"홍길동","이순신","장보고","김유신"};
		Arrays.sort(user_data);	//가나다라순으로 데이터 정렬
		System.out.println(Arrays.toString(user_data));
		*/
		
		/*
		 변수를 2개 생성해서 하나는 문자, 하나는 숫자
		 현재 가입된 사용자 아이디를 확인 후 해당 포인트가 적립되도록 합니다.
		 단, 기존 포인트 + 적립금 포인트에 대한 결과를 출력하세요.
		 출력은 메인 클래스에서 합니다.
		 배열데이터 : 
		 */
		
		/*
		
		ide_mth1 im = new ide_mth1();
		im.setter(user,point);
		*/
		
		String user = "lee";
		int point = 2500;
		
		ide_mth1 m1 = new ide_mth1();
		m1.setter(user,point);
		System.out.println(m1.getter());
		
		
		
		
	}

}

class ide_mth1 extends mth1 {
	private String member_ship[][];
	private String data1;
	private int data2;
	private int ea;
	private int total;
	public ide_mth1() {
		this.member_ship = new String[][] { 
			{ "kim", "park", "seo", "oh", "lee", "jang", "jeong", "cho", "ha", "wang" },
			{ "1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800" } 
		};
		this.ea = this.member_ship[0].length;
		
	}
	

	@Override
	public void setter(String data1, int data2) {	//세터는 값을 받아서 선언하고 다른 메소드로 전달하는 역할
		this.data1 = data1;
		this.data2 = data2;
		this.loops(this.data1, this.data2, this.ea);
		
		
		/*
		if(data3.equals("증감")) {			
			this.loops();
		}
		else {
			this.loops2();
		}
		*/
	};
	/*this를 배제하고 코드를 메모리에 올려놔야 할 때*/
	public void loops(String a, int b, int c) {	
		int w = 0;
		while(w < c) {
			if(this.member_ship[0][w].equals(a)) {
				this.total = Integer.parseInt(this.member_ship[1][w])+b;
			}
			w++;
		}
		
	
	}

	@Override
	public void setter(int data3[]) {
	};

	@Override
	public String getter() {
		String print = this.data1 + "님 포인트가" + this.total + "증감 되었습니다.";
		return print;
	};
}

/*
class ide_mth1 extends mth1 {
	private String member_ship[][];
	private String user2;
	private int point2;
	private int total;
	@Override
	public void setter(String data1, int data2) {
		this.member_ship = new String [][] { 
				{ "kim", "park", "seo", "oh", "lee", "jang", "jeong", "cho", "ha", "wang" },
				{ "1500", "800", "2000", "1000", "4200", "2200", "3000", "500", "1000", "1800" } 
		};
		this.user2 = data1;
		this.point2 = data2;
		int w = 0;
		while(w < member_ship[1].length) {
			if(this.(member_ship[0][w]).equals(this.user2)) {
				this.total = Integer.parseInt(member_ship[1][w]);
			}
			w++;
		}
		this.total+=this.point2;
		System.out.println(user2+"님 총 포인트는 "+getter()+"원입니다.");
	};
	@Override
	public void setter(int data3[]) {};
	@Override
	public int getter() {
		return this.total;
	};
}
*/